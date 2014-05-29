package nsl

import java.util.Locale
import java.io.{PrintWriter, File}

object TupleCodeGenerator {
  val classFileTemplate: String =
    """
      |package nsl;
      |
      |import com.google.common.base.Objects;
      |
      |public final class Tuple%s {
      |  private static final String FORMAT = "%s";
      |  public class ImmutableTuple%s<%s> {
      |    private final String mToString;
      |    private final int mHashCode;
      |    %s
      |    protected ImmutableTuple%s(
      |        %s
      |    ) {
      |      %s
      |      mToString = String.format(FORMAT, %s);
      |      mHashCode = Objects.hashCode(%s);
      |    }
      |    %s
      |    public String toString() { return mToString; }
      |    public int hashCode() { return mHashCode; }
      |    public boolean equals(final Object obj) {
      |      if ((null == obj) || (getClass() != obj.getClass())) {
      |        return false;
      |      } else {
      |        final ImmutableTuple%s that = (ImmutableTuple%s) obj;
      |        return %s
      |      }
      |    }
      |  }
      |  public class MutableTuple%s<%s> {
      |    %s
      |    protected MutableTuple%s() { }
      |    protected MutableTuple%s(
      |      %s
      |    ) {
      |      %s
      |    }
      |    %s
      |    %s
      |    public String toString() { return String.format(FORMAT, %s); }
      |    public int hashCode() { return Objects.hashCode(%s); }
      |    public boolean equals(final Object obj) {
      |      if (null == obj || getClass() != obj.getClass()) {
      |        return false;
      |      } else {
      |        final MutableTuple%s that = (MutableTuple%s) obj;
      |        return %s
      |      }
      |    }
      |  }
      |}
    """.stripMargin

  val classFileTemplateBackup: String =
    """
      |package nsl;
      |
      |import com.google.common.base.Objects;
      |
      |public final class Tuple%s {
      |  private static final String FORMAT = "%s";
      |  public class ImmutableTuple%s<%s> {
      |    private final String mToString;
      |    private final int mHashCode;
      |    %s
      |    protected ImmutableTuple%s(
      |        %s
      |    ) {
      |      %s
      |      mToString = String.format(FORMAT, %s);
      |      mHashCode = Objects.hashCode(%s);
      |    }
      |    %s
      |    public MutableTuple%s unfreeze() { return new MutableTuple%s(%s); }
      |    public String toString() { return mToString; }
      |    public int hashCode() { return mHashCode; }
      |    public boolean equals(final Object obj) {
      |      if ((null == obj) || (getClass() != obj.getClass())) {
      |        return false;
      |      } else {
      |        final ImmutableTuple%s that = (ImmutableTuple%s) obj;
      |        return %s
      |      }
      |    }
      |  }
      |  public class MutableTuple%s<%s> {
      |    %s
      |    protected MutableTuple%s() { }
      |    protected MutableTuple%s(
      |      %s
      |    ) {
      |      %s
      |    }
      |    %s
      |    %s
      |    public ImmutableTuple%s freeze() { return new ImmutableTuple%s(%s); }
      |    public String toString() { return String.format(FORMAT, %s); }
      |    public int hashCode() { return Objects.hashCode(%s); }
      |    public boolean equals(final Object obj) {
      |      if (null == obj || getClass() != obj.getClass()) {
      |        return false;
      |      } else {
      |        final MutableTuple%s that = (MutableTuple%s) obj;
      |        return %s
      |      }
      |    }
      |  }
      |}
    """.stripMargin
  // num params
  // type parameters separated by ", "
  // members
  // num
  // num
  // constructor params
  // field assignment
  // fields list
  // fields list
  // num
  // num
  // equality statement




  def format(numParameters: Int): String = {
    val paramNames: List[String] = Range(1, numParameters + 1).toList.map { counters.getOrElse(_, sys.error("Too many parameters"))}
    classFileTemplate.format(
      numParameters,
      formatString(numParameters),
      numParameters,
      paramNames.map { typeParameter(_) }.mkString(", "),
      paramNames.map { finalField(_) }.mkString("\n    "),
      numParameters,
      paramNames.map { constructorParam(_) }.mkString(",\n        "),
      paramNames.map { fieldAssignment(_) }.mkString("\n      "),
      paramNames.mkString(", "),
      paramNames.map { member(_) }.mkString(", "),
      getters(paramNames),
//      numParameters,
//      numParameters,
//      paramNames.map { member(_) }.mkString(", "),
      numParameters,
      numParameters,
      equalityStatement(paramNames),
      numParameters,
      paramNames.map { typeParameter(_) }.mkString(", "),
      paramNames.map { mutableField(_) }.mkString("\n    "),
      numParameters,
      numParameters,
      paramNames.map { constructorParam(_) }.mkString(",\n      "),
      paramNames.map { fieldAssignment(_) }.mkString("\n      "),
      getters(paramNames),
      setters(paramNames),
//      numParameters,
//      numParameters,
//      paramNames.map { member(_) }.mkString(", "),
      paramNames.map { member(_) }.mkString(", "),
      paramNames.map { member(_) }.mkString(", "),
      numParameters,
      numParameters,
      equalityStatement(paramNames)
    )
  }

  def capitalize(s: String): String = s.head.toUpper + s.tail
  def member(s: String): String = "m" + capitalize(s)
  def argument(s: String): String = s
  def typeParameter(s: String): String = s.toUpperCase(Locale.ROOT)

  def formatString(i: Int): String = Range(0, i).map { n: Int => "%s" }.mkString("(", ", ", ")")
  def finalField(s: String): String = "private final %s %s;".format(typeParameter(s), member(s))
  def mutableField(s: String): String = "private %s %s;".format(typeParameter(s), member(s))
  def getter(s: String): String = "public %s %s() { return %s; }".format(typeParameter(s), s, member(s))
  def setter(s: String): String = "public %s set%s(final %s new%s) { final %s old%s = %s; %s = new%s; return old%s; }".format(typeParameter(s), capitalize(s), typeParameter(s), capitalize(s), typeParameter(s), capitalize(s), member(s), member(s), capitalize(s), capitalize(s))
  def constructorParam(s: String): String = "final %s %s".format(typeParameter(s), argument(s))
  def fieldAssignment(s: String): String = "%s = %s;".format(member(s), argument(s))
  def equality(s: String): String = { val m: String = member(s); "Objects.equal(this.%s, that.%s)".format(m, m) }
  def equalityStatement(paramNames: List[String]): String = {
    if (paramNames.isEmpty) "true;"
    else if (paramNames.size == 1) "%s;".format(equality(paramNames.head))
    else "%s;".format(paramNames.map { equality(_) }.mkString("\n            && "))
  }
  def getters(paramNames: List[String]): String = paramNames.map { getter(_) }.mkString("\n    ")
  def setters(paramNames: List[String]): String = paramNames.map { setter(_) }.mkString("\n    ")


  val counters: Map[Int, String] = Map(
    1 -> "first",
    2 -> "second",
    3 -> "third",
    4 -> "fourth",
    5 -> "fifth",
    6 -> "sixth",
    7 -> "seventh",
    8 -> "eighth",
    9 -> "ninth",
    10 -> "tenth",
    11 -> "eleventh",
    12 -> "twelfth",
    13 -> "thirteenth",
    14 -> "fourteenth",
    15 -> "fifteenth",
    16 -> "sixteenth",
    17 -> "seventeenth",
    18 -> "eighteenth",
    19 -> "nineteenth",
    20 -> "twentieth",
    21 -> "twentyFirst",
    22 -> "twentySecond",
    23 -> "twentyThird",
    24 -> "twentyFourth",
    25 -> "twentyFifth",
    26 -> "twentySixth",
    27 -> "twentySeventh",
    28 -> "twentyEighth",
    29 -> "twentyNinth",
    30 -> "thirtieth"
  )

  def main(args: Array[String]) {
    val home: File = new File(System.getProperty("user.home"))
    val tupleDir: File = new File(home, "src/thenonstandard-library/src/main/java/nsl/")
    Range(1, counters.size + 1).foreach { (i: Int) =>
      val file: File = new File(tupleDir, "Tuple%s.java".format(i))
      file.createNewFile()
      val pw: PrintWriter = new PrintWriter(file)
      try {
        pw.println(format(i))
      } finally {
        pw.close()
      }

    }
  }

  // number of arguments
  // number of arguments
  // all type arguments separated by ", "
  // formatString
  // members
  // number of args
  // constructor params
  // field assignments
  // ", " separated list of fields.
  // ", " separated list of fields.
  // number of args
  // number of args
  // equality statement
}
