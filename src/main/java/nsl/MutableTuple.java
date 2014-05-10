package nsl;

import com.google.common.base.Objects;
import nsl.Tuple.Tuple0;
import nsl.Tuple.Tuple1;

public abstract class MutableTuple<T> {

  public abstract T freeze();

  public static class Tuple0Builder extends MutableTuple<Tuple0> {
    private static final String mToString = "()";
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return 0;
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      return obj instanceof Tuple0Builder;
    }
    @Override
    public Tuple0 freeze() {
      return new Tuple0();
    }
  }

  public static abstract class Tuple1Builder<FIRST> extends MutableTuple<Tuple1<FIRST>> {
    private static final String FORMAT = "(%s)";
    protected FIRST mFirst;
    protected Tuple1Builder() {
      this(null);
    }
    protected Tuple1Builder(
        final FIRST first
    ) {
      mFirst = first;
    }
    @Override
    public String toString() {
      return String.format(FORMAT, mFirst);
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple1Builder)) {
        return false;
      }
      final Tuple1Builder that = (Tuple1Builder) obj;
      return Objects.equal(this.mFirst, that.mFirst);
    }
  }
}
