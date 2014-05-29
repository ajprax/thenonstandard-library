
package nsl;

import com.google.common.base.Objects;

public final class Tuple3 {
  private static final String FORMAT = "(%s, %s, %s)";
  public class ImmutableTuple3<FIRST, SECOND, THIRD> {
    private final String mToString;
    private final int mHashCode;
    private final FIRST mFirst;
    private final SECOND mSecond;
    private final THIRD mThird;
    protected ImmutableTuple3(
        final FIRST first,
        final SECOND second,
        final THIRD third
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
      mToString = String.format(FORMAT, first, second, third);
      mHashCode = Objects.hashCode(mFirst, mSecond, mThird);
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public String toString() { return mToString; }
    public int hashCode() { return mHashCode; }
    public boolean equals(final Object obj) {
      if ((null == obj) || (getClass() != obj.getClass())) {
        return false;
      } else {
        final ImmutableTuple3 that = (ImmutableTuple3) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird);
      }
    }
  }
  public class MutableTuple3<FIRST, SECOND, THIRD> {
    private FIRST mFirst;
    private SECOND mSecond;
    private THIRD mThird;
    protected MutableTuple3() { }
    protected MutableTuple3(
      final FIRST first,
      final SECOND second,
      final THIRD third
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public FIRST setFirst(final FIRST newFirst) { final FIRST oldFirst = mFirst; mFirst = newFirst; return oldFirst; }
    public SECOND setSecond(final SECOND newSecond) { final SECOND oldSecond = mSecond; mSecond = newSecond; return oldSecond; }
    public THIRD setThird(final THIRD newThird) { final THIRD oldThird = mThird; mThird = newThird; return oldThird; }
    public String toString() { return String.format(FORMAT, mFirst, mSecond, mThird); }
    public int hashCode() { return Objects.hashCode(mFirst, mSecond, mThird); }
    public boolean equals(final Object obj) {
      if (null == obj || getClass() != obj.getClass()) {
        return false;
      } else {
        final MutableTuple3 that = (MutableTuple3) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird);
      }
    }
  }
}
    
