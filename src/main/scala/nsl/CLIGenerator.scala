package nsl

object CLIGenerator {

  def memberify(n: String): String = "m" + n.head.toUpper + n.tail

  case class Field(name: String, usage: String, typ: String, required: Boolean) {
    val member: String = memberify(name)
    val FieldFormat: String =
     s"""@Flag(name="$name", usage="$usage")
        |private $typ $member = null;
      """.stripMargin

    val ValidationFormat: String =
     s"""${if (required) s"Preconditions.checkNotNull($member);\n" else ""}
        |
      """.stripMargin
  }

  def main(args: Array[String]) {
    val f: Field = Field("kiji", "Kiji instance.", "String", true)
    println(f.FieldFormat)
    println(f.ValidationFormat)
  }
}
