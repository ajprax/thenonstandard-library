
package nsl;

import com.google.common.base.Objects;

public final class Tuple4 {
  private static final String FORMAT = "(%s, %s, %s, %s)";
  public class ImmutableTuple4<FIRST, SECOND, THIRD, FOURTH> {
    private final String mToString;
    private final int mHashCode;
    private final FIRST mFirst;
    private final SECOND mSecond;
    private final THIRD mThird;
    private final FOURTH mFourth;
    protected ImmutableTuple4(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
      mFourth = fourth;
      mToString = String.format(FORMAT, first, second, third, fourth);
      mHashCode = Objects.hashCode(mFirst, mSecond, mThird, mFourth);
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public FOURTH fourth() { return mFourth; }
    public String toString() { return mToString; }
    public int hashCode() { return mHashCode; }
    public boolean equals(final Object obj) {
      if ((null == obj) || (getClass() != obj.getClass())) {
        return false;
      } else {
        final ImmutableTuple4 that = (ImmutableTuple4) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird)
            && Objects.equal(this.mFourth, that.mFourth);
      }
    }
  }
  public class MutableTuple4<FIRST, SECOND, THIRD, FOURTH> {
    private FIRST mFirst;
    private SECOND mSecond;
    private THIRD mThird;
    private FOURTH mFourth;
    protected MutableTuple4() { }
    protected MutableTuple4(
      final FIRST first,
      final SECOND second,
      final THIRD third,
      final FOURTH fourth
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
      mFourth = fourth;
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public FOURTH fourth() { return mFourth; }
    public FIRST setFirst(final FIRST newFirst) { final FIRST oldFirst = mFirst; mFirst = newFirst; return oldFirst; }
    public SECOND setSecond(final SECOND newSecond) { final SECOND oldSecond = mSecond; mSecond = newSecond; return oldSecond; }
    public THIRD setThird(final THIRD newThird) { final THIRD oldThird = mThird; mThird = newThird; return oldThird; }
    public FOURTH setFourth(final FOURTH newFourth) { final FOURTH oldFourth = mFourth; mFourth = newFourth; return oldFourth; }
    public String toString() { return String.format(FORMAT, mFirst, mSecond, mThird, mFourth); }
    public int hashCode() { return Objects.hashCode(mFirst, mSecond, mThird, mFourth); }
    public boolean equals(final Object obj) {
      if (null == obj || getClass() != obj.getClass()) {
        return false;
      } else {
        final MutableTuple4 that = (MutableTuple4) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird)
            && Objects.equal(this.mFourth, that.mFourth);
      }
    }
  }
}
    
