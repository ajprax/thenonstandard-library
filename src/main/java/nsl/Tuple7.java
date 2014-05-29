
package nsl;

import com.google.common.base.Objects;

public final class Tuple7 {
  private static final String FORMAT = "(%s, %s, %s, %s, %s, %s, %s)";
  public class ImmutableTuple7<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH> {
    private final String mToString;
    private final int mHashCode;
    private final FIRST mFirst;
    private final SECOND mSecond;
    private final THIRD mThird;
    private final FOURTH mFourth;
    private final FIFTH mFifth;
    private final SIXTH mSixth;
    private final SEVENTH mSeventh;
    protected ImmutableTuple7(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth,
        final SIXTH sixth,
        final SEVENTH seventh
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
      mFourth = fourth;
      mFifth = fifth;
      mSixth = sixth;
      mSeventh = seventh;
      mToString = String.format(FORMAT, first, second, third, fourth, fifth, sixth, seventh);
      mHashCode = Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh);
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public FOURTH fourth() { return mFourth; }
    public FIFTH fifth() { return mFifth; }
    public SIXTH sixth() { return mSixth; }
    public SEVENTH seventh() { return mSeventh; }
    public String toString() { return mToString; }
    public int hashCode() { return mHashCode; }
    public boolean equals(final Object obj) {
      if ((null == obj) || (getClass() != obj.getClass())) {
        return false;
      } else {
        final ImmutableTuple7 that = (ImmutableTuple7) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird)
            && Objects.equal(this.mFourth, that.mFourth)
            && Objects.equal(this.mFifth, that.mFifth)
            && Objects.equal(this.mSixth, that.mSixth)
            && Objects.equal(this.mSeventh, that.mSeventh);
      }
    }
  }
  public class MutableTuple7<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH> {
    private FIRST mFirst;
    private SECOND mSecond;
    private THIRD mThird;
    private FOURTH mFourth;
    private FIFTH mFifth;
    private SIXTH mSixth;
    private SEVENTH mSeventh;
    protected MutableTuple7() { }
    protected MutableTuple7(
      final FIRST first,
      final SECOND second,
      final THIRD third,
      final FOURTH fourth,
      final FIFTH fifth,
      final SIXTH sixth,
      final SEVENTH seventh
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
      mFourth = fourth;
      mFifth = fifth;
      mSixth = sixth;
      mSeventh = seventh;
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public FOURTH fourth() { return mFourth; }
    public FIFTH fifth() { return mFifth; }
    public SIXTH sixth() { return mSixth; }
    public SEVENTH seventh() { return mSeventh; }
    public FIRST setFirst(final FIRST newFirst) { final FIRST oldFirst = mFirst; mFirst = newFirst; return oldFirst; }
    public SECOND setSecond(final SECOND newSecond) { final SECOND oldSecond = mSecond; mSecond = newSecond; return oldSecond; }
    public THIRD setThird(final THIRD newThird) { final THIRD oldThird = mThird; mThird = newThird; return oldThird; }
    public FOURTH setFourth(final FOURTH newFourth) { final FOURTH oldFourth = mFourth; mFourth = newFourth; return oldFourth; }
    public FIFTH setFifth(final FIFTH newFifth) { final FIFTH oldFifth = mFifth; mFifth = newFifth; return oldFifth; }
    public SIXTH setSixth(final SIXTH newSixth) { final SIXTH oldSixth = mSixth; mSixth = newSixth; return oldSixth; }
    public SEVENTH setSeventh(final SEVENTH newSeventh) { final SEVENTH oldSeventh = mSeventh; mSeventh = newSeventh; return oldSeventh; }
    public String toString() { return String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh); }
    public int hashCode() { return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh); }
    public boolean equals(final Object obj) {
      if (null == obj || getClass() != obj.getClass()) {
        return false;
      } else {
        final MutableTuple7 that = (MutableTuple7) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird)
            && Objects.equal(this.mFourth, that.mFourth)
            && Objects.equal(this.mFifth, that.mFifth)
            && Objects.equal(this.mSixth, that.mSixth)
            && Objects.equal(this.mSeventh, that.mSeventh);
      }
    }
  }
}
    
