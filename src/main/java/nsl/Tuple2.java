
package nsl;

import com.google.common.base.Objects;

public final class Tuple2 {
  private static final String FORMAT = "(%s, %s)";
  public class ImmutableTuple2<FIRST, SECOND> {
    private final String mToString;
    private final int mHashCode;
    private final FIRST mFirst;
    private final SECOND mSecond;
    protected ImmutableTuple2(
        final FIRST first,
        final SECOND second
    ) {
      mFirst = first;
      mSecond = second;
      mToString = String.format(FORMAT, first, second);
      mHashCode = Objects.hashCode(mFirst, mSecond);
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public String toString() { return mToString; }
    public int hashCode() { return mHashCode; }
    public boolean equals(final Object obj) {
      if ((null == obj) || (getClass() != obj.getClass())) {
        return false;
      } else {
        final ImmutableTuple2 that = (ImmutableTuple2) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond);
      }
    }
  }
  public class MutableTuple2<FIRST, SECOND> {
    private FIRST mFirst;
    private SECOND mSecond;
    protected MutableTuple2() { }
    protected MutableTuple2(
      final FIRST first,
      final SECOND second
    ) {
      mFirst = first;
      mSecond = second;
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public FIRST setFirst(final FIRST newFirst) { final FIRST oldFirst = mFirst; mFirst = newFirst; return oldFirst; }
    public SECOND setSecond(final SECOND newSecond) { final SECOND oldSecond = mSecond; mSecond = newSecond; return oldSecond; }
    public String toString() { return String.format(FORMAT, mFirst, mSecond); }
    public int hashCode() { return Objects.hashCode(mFirst, mSecond); }
    public boolean equals(final Object obj) {
      if (null == obj || getClass() != obj.getClass()) {
        return false;
      } else {
        final MutableTuple2 that = (MutableTuple2) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond);
      }
    }
  }
}
    
