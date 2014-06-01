
package nsl;

import com.google.common.base.Objects;

public final class Tuple12 {
  private static final String FORMAT = "(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)";
  public class ImmutableTuple12<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH, TENTH, ELEVENTH, TWELFTH> {
    private final String mToString;
    private final int mHashCode;
    private final FIRST mFirst;
    private final SECOND mSecond;
    private final THIRD mThird;
    private final FOURTH mFourth;
    private final FIFTH mFifth;
    private final SIXTH mSixth;
    private final SEVENTH mSeventh;
    private final EIGHTH mEighth;
    private final NINTH mNinth;
    private final TENTH mTenth;
    private final ELEVENTH mEleventh;
    private final TWELFTH mTwelfth;
    protected ImmutableTuple12(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth,
        final SIXTH sixth,
        final SEVENTH seventh,
        final EIGHTH eighth,
        final NINTH ninth,
        final TENTH tenth,
        final ELEVENTH eleventh,
        final TWELFTH twelfth
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
      mFourth = fourth;
      mFifth = fifth;
      mSixth = sixth;
      mSeventh = seventh;
      mEighth = eighth;
      mNinth = ninth;
      mTenth = tenth;
      mEleventh = eleventh;
      mTwelfth = twelfth;
      mToString = String.format(FORMAT, first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth);
      mHashCode = Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh, mEighth, mNinth, mTenth, mEleventh, mTwelfth);
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public FOURTH fourth() { return mFourth; }
    public FIFTH fifth() { return mFifth; }
    public SIXTH sixth() { return mSixth; }
    public SEVENTH seventh() { return mSeventh; }
    public EIGHTH eighth() { return mEighth; }
    public NINTH ninth() { return mNinth; }
    public TENTH tenth() { return mTenth; }
    public ELEVENTH eleventh() { return mEleventh; }
    public TWELFTH twelfth() { return mTwelfth; }
    public String toString() { return mToString; }
    public int hashCode() { return mHashCode; }
    public boolean equals(final Object obj) {
      if ((null == obj) || (getClass() != obj.getClass())) {
        return false;
      } else {
        final ImmutableTuple12 that = (ImmutableTuple12) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird)
            && Objects.equal(this.mFourth, that.mFourth)
            && Objects.equal(this.mFifth, that.mFifth)
            && Objects.equal(this.mSixth, that.mSixth)
            && Objects.equal(this.mSeventh, that.mSeventh)
            && Objects.equal(this.mEighth, that.mEighth)
            && Objects.equal(this.mNinth, that.mNinth)
            && Objects.equal(this.mTenth, that.mTenth)
            && Objects.equal(this.mEleventh, that.mEleventh)
            && Objects.equal(this.mTwelfth, that.mTwelfth);
      }
    }
  }
  public class MutableTuple12<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH, TENTH, ELEVENTH, TWELFTH> {
    private FIRST mFirst;
    private SECOND mSecond;
    private THIRD mThird;
    private FOURTH mFourth;
    private FIFTH mFifth;
    private SIXTH mSixth;
    private SEVENTH mSeventh;
    private EIGHTH mEighth;
    private NINTH mNinth;
    private TENTH mTenth;
    private ELEVENTH mEleventh;
    private TWELFTH mTwelfth;
    protected MutableTuple12() { }
    protected MutableTuple12(
      final FIRST first,
      final SECOND second,
      final THIRD third,
      final FOURTH fourth,
      final FIFTH fifth,
      final SIXTH sixth,
      final SEVENTH seventh,
      final EIGHTH eighth,
      final NINTH ninth,
      final TENTH tenth,
      final ELEVENTH eleventh,
      final TWELFTH twelfth
    ) {
      mFirst = first;
      mSecond = second;
      mThird = third;
      mFourth = fourth;
      mFifth = fifth;
      mSixth = sixth;
      mSeventh = seventh;
      mEighth = eighth;
      mNinth = ninth;
      mTenth = tenth;
      mEleventh = eleventh;
      mTwelfth = twelfth;
    }
    public FIRST first() { return mFirst; }
    public SECOND second() { return mSecond; }
    public THIRD third() { return mThird; }
    public FOURTH fourth() { return mFourth; }
    public FIFTH fifth() { return mFifth; }
    public SIXTH sixth() { return mSixth; }
    public SEVENTH seventh() { return mSeventh; }
    public EIGHTH eighth() { return mEighth; }
    public NINTH ninth() { return mNinth; }
    public TENTH tenth() { return mTenth; }
    public ELEVENTH eleventh() { return mEleventh; }
    public TWELFTH twelfth() { return mTwelfth; }
    public FIRST setFirst(final FIRST newFirst) { final FIRST oldFirst = mFirst; mFirst = newFirst; return oldFirst; }
    public SECOND setSecond(final SECOND newSecond) { final SECOND oldSecond = mSecond; mSecond = newSecond; return oldSecond; }
    public THIRD setThird(final THIRD newThird) { final THIRD oldThird = mThird; mThird = newThird; return oldThird; }
    public FOURTH setFourth(final FOURTH newFourth) { final FOURTH oldFourth = mFourth; mFourth = newFourth; return oldFourth; }
    public FIFTH setFifth(final FIFTH newFifth) { final FIFTH oldFifth = mFifth; mFifth = newFifth; return oldFifth; }
    public SIXTH setSixth(final SIXTH newSixth) { final SIXTH oldSixth = mSixth; mSixth = newSixth; return oldSixth; }
    public SEVENTH setSeventh(final SEVENTH newSeventh) { final SEVENTH oldSeventh = mSeventh; mSeventh = newSeventh; return oldSeventh; }
    public EIGHTH setEighth(final EIGHTH newEighth) { final EIGHTH oldEighth = mEighth; mEighth = newEighth; return oldEighth; }
    public NINTH setNinth(final NINTH newNinth) { final NINTH oldNinth = mNinth; mNinth = newNinth; return oldNinth; }
    public TENTH setTenth(final TENTH newTenth) { final TENTH oldTenth = mTenth; mTenth = newTenth; return oldTenth; }
    public ELEVENTH setEleventh(final ELEVENTH newEleventh) { final ELEVENTH oldEleventh = mEleventh; mEleventh = newEleventh; return oldEleventh; }
    public TWELFTH setTwelfth(final TWELFTH newTwelfth) { final TWELFTH oldTwelfth = mTwelfth; mTwelfth = newTwelfth; return oldTwelfth; }
    public String toString() { return String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh, mEighth, mNinth, mTenth, mEleventh, mTwelfth); }
    public int hashCode() { return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh, mEighth, mNinth, mTenth, mEleventh, mTwelfth); }
    public boolean equals(final Object obj) {
      if (null == obj || getClass() != obj.getClass()) {
        return false;
      } else {
        final MutableTuple12 that = (MutableTuple12) obj;
        return Objects.equal(this.mFirst, that.mFirst)
            && Objects.equal(this.mSecond, that.mSecond)
            && Objects.equal(this.mThird, that.mThird)
            && Objects.equal(this.mFourth, that.mFourth)
            && Objects.equal(this.mFifth, that.mFifth)
            && Objects.equal(this.mSixth, that.mSixth)
            && Objects.equal(this.mSeventh, that.mSeventh)
            && Objects.equal(this.mEighth, that.mEighth)
            && Objects.equal(this.mNinth, that.mNinth)
            && Objects.equal(this.mTenth, that.mTenth)
            && Objects.equal(this.mEleventh, that.mEleventh)
            && Objects.equal(this.mTwelfth, that.mTwelfth);
      }
    }
  }
}
    
