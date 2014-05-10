package nsl;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/**
 * Contains implementations of generic tuple classes to provide toString, hashCode, and equals.
 *
 * <p>
 *   Tuples are immutable and may not contain null values.
 * </p>
 * <p>
 *   To use, extend the tuple class of the appropriate size and add getter methods.
 * </p>
 */
public class Tuple {

  public static class Tuple0 {
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
      return obj instanceof Tuple0;
    }
  }

  public static class Tuple1<FIRST> {
    private static final String FORMAT = "(%s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected Tuple1(
        final FIRST first
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mToString = String.format(FORMAT, mFirst);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple1)) {
        return false;
      }
      final Tuple1 that = (Tuple1) obj;
      return Objects.equal(this.mFirst, that.mFirst);
    }
  }

  public static class Tuple2<FIRST, SECOND> {
    private static final String FORMAT = "(%s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected Tuple2(
        final FIRST first,
        final SECOND second
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mToString = String.format(FORMAT, mFirst, mSecond);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple2)) {
        return false;
      }
      final Tuple2 that = (Tuple2) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond);
    }
  }

  public static class Tuple3<FIRST, SECOND, THIRD> {
    private static final String FORMAT = "(%s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected Tuple3(
        final FIRST first,
        final SECOND second,
        final THIRD third
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple3)) {
        return false;
      }
      final Tuple3 that = (Tuple3) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird);
    }
  }

  public static class Tuple4<FIRST, SECOND, THIRD, FOURTH> {
    private static final String FORMAT = "(%s, %s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected final FOURTH mFourth;
    protected Tuple4(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mFourth = Preconditions.checkNotNull(fourth);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird, mFourth);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird, mFourth);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple4)) {
        return false;
      }
      final Tuple4 that = (Tuple4) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird)
          && Objects.equal(this.mFourth, that.mFourth);
    }
  }

  public static class Tuple5<FIRST, SECOND, THIRD, FOURTH, FIFTH> {
    private static final String FORMAT = "(%s, %s, %s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected final FOURTH mFourth;
    protected final FIFTH mFifth;
    protected Tuple5(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mFourth = Preconditions.checkNotNull(fourth);
      mFifth = Preconditions.checkNotNull(fifth);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple5)) {
        return false;
      }
      final Tuple5 that = (Tuple5) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird)
          && Objects.equal(this.mFourth, that.mFourth)
          && Objects.equal(this.mFifth, that.mFifth);
    }
  }

  public static class Tuple6<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH> {
    private static final String FORMAT = "(%s, %s, %s, %s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected final FOURTH mFourth;
    protected final FIFTH mFifth;
    protected final SIXTH mSixth;
    protected Tuple6(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth,
        final SIXTH sixth
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mFourth = Preconditions.checkNotNull(fourth);
      mFifth = Preconditions.checkNotNull(fifth);
      mSixth = Preconditions.checkNotNull(sixth);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth, mSixth);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple6)) {
        return false;
      }
      final Tuple6 that = (Tuple6) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird)
          && Objects.equal(this.mFourth, that.mFourth)
          && Objects.equal(this.mFifth, that.mFifth)
          && Objects.equal(this.mSixth, that.mSixth);
    }
  }

  public static class Tuple7<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH> {
    private static final String FORMAT = "(%s, %s, %s, %s, %s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected final FOURTH mFourth;
    protected final FIFTH mFifth;
    protected final SIXTH mSixth;
    protected final SEVENTH mSeventh;
    protected Tuple7(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth,
        final SIXTH sixth,
        final SEVENTH seventh
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mFourth = Preconditions.checkNotNull(fourth);
      mFifth = Preconditions.checkNotNull(fifth);
      mSixth = Preconditions.checkNotNull(sixth);
      mSeventh = Preconditions.checkNotNull(seventh);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple7)) {
        return false;
      }
      final Tuple7 that = (Tuple7) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird)
          && Objects.equal(this.mFourth, that.mFourth)
          && Objects.equal(this.mFifth, that.mFifth)
          && Objects.equal(this.mSixth, that.mSixth)
          && Objects.equal(this.mSeventh, that.mSeventh);
    }
  }

  public static class Tuple8<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH> {
    private static final String FORMAT = "(%s, %s, %s, %s, %s, %s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected final FOURTH mFourth;
    protected final FIFTH mFifth;
    protected final SIXTH mSixth;
    protected final SEVENTH mSeventh;
    protected final EIGHTH mEighth;
    protected Tuple8(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth,
        final SIXTH sixth,
        final SEVENTH seventh,
        final EIGHTH eighth
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mFourth = Preconditions.checkNotNull(fourth);
      mFifth = Preconditions.checkNotNull(fifth);
      mSixth = Preconditions.checkNotNull(sixth);
      mSeventh = Preconditions.checkNotNull(seventh);
      mEighth = Preconditions.checkNotNull(eighth);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh,
          mEighth);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh, mEighth);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple8)) {
        return false;
      }
      final Tuple8 that = (Tuple8) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird)
          && Objects.equal(this.mFourth, that.mFourth)
          && Objects.equal(this.mFifth, that.mFifth)
          && Objects.equal(this.mSixth, that.mSixth)
          && Objects.equal(this.mSeventh, that.mSeventh)
          && Objects.equal(this.mEighth, that.mEighth);
    }
  }

  public static class Tuple9<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH> {
    private static final String FORMAT = "(%s, %s, %s, %s, %s, %s, %s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected final FOURTH mFourth;
    protected final FIFTH mFifth;
    protected final SIXTH mSixth;
    protected final SEVENTH mSeventh;
    protected final EIGHTH mEighth;
    protected final NINTH mNinth;
    protected Tuple9(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth,
        final SIXTH sixth,
        final SEVENTH seventh,
        final EIGHTH eighth,
        final NINTH ninth
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mFourth = Preconditions.checkNotNull(fourth);
      mFifth = Preconditions.checkNotNull(fifth);
      mSixth = Preconditions.checkNotNull(sixth);
      mSeventh = Preconditions.checkNotNull(seventh);
      mEighth = Preconditions.checkNotNull(eighth);
      mNinth = Preconditions.checkNotNull(ninth);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh,
          mEighth, mNinth);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh, mEighth,
          mNinth);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple9)) {
        return false;
      }
      final Tuple9 that = (Tuple9) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird)
          && Objects.equal(this.mFourth, that.mFourth)
          && Objects.equal(this.mFifth, that.mFifth)
          && Objects.equal(this.mSixth, that.mSixth)
          && Objects.equal(this.mSeventh, that.mSeventh)
          && Objects.equal(this.mEighth, that.mEighth)
          && Objects.equal(this.mNinth, that.mNinth);
    }
  }

  public static class Tuple10<FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH,
      TENTH> {
    private static final String FORMAT = "(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)";
    private final String mToString;
    protected final FIRST mFirst;
    protected final SECOND mSecond;
    protected final THIRD mThird;
    protected final FOURTH mFourth;
    protected final FIFTH mFifth;
    protected final SIXTH mSixth;
    protected final SEVENTH mSeventh;
    protected final EIGHTH mEighth;
    protected final NINTH mNinth;
    protected final TENTH mTenth;
    protected Tuple10(
        final FIRST first,
        final SECOND second,
        final THIRD third,
        final FOURTH fourth,
        final FIFTH fifth,
        final SIXTH sixth,
        final SEVENTH seventh,
        final EIGHTH eighth,
        final NINTH ninth,
        final TENTH tenth
    ) {
      mFirst = Preconditions.checkNotNull(first);
      mSecond = Preconditions.checkNotNull(second);
      mThird = Preconditions.checkNotNull(third);
      mFourth = Preconditions.checkNotNull(fourth);
      mFifth = Preconditions.checkNotNull(fifth);
      mSixth = Preconditions.checkNotNull(sixth);
      mSeventh = Preconditions.checkNotNull(seventh);
      mEighth = Preconditions.checkNotNull(eighth);
      mNinth = Preconditions.checkNotNull(ninth);
      mTenth = Preconditions.checkNotNull(tenth);
      mToString = String.format(FORMAT, mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh,
          mEighth, mNinth, mTenth);
    }
    @Override
    public String toString() {
      return mToString;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeventh, mEighth,
          mNinth, mTenth);
    }
    @Override
    public boolean equals(
        final Object obj
    ) {
      if (null == obj || !(obj instanceof Tuple10)) {
        return false;
      }
      final Tuple10 that = (Tuple10) obj;
      return Objects.equal(this.mFirst, that.mFirst)
          && Objects.equal(this.mSecond, that.mSecond)
          && Objects.equal(this.mThird, that.mThird)
          && Objects.equal(this.mFourth, that.mFourth)
          && Objects.equal(this.mFifth, that.mFifth)
          && Objects.equal(this.mSixth, that.mSixth)
          && Objects.equal(this.mSeventh, that.mSeventh)
          && Objects.equal(this.mEighth, that.mEighth)
          && Objects.equal(this.mNinth, that.mNinth)
          && Objects.equal(this.mTenth, that.mTenth);
    }
  }
}
