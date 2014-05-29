
package nsl;

import com.google.common.base.Objects;

public final class Tuple1 {
  private static final String FORMAT = "(%s)";
  public class ImmutableTuple1<FIRST> {
    private final String mToString;
    private final int mHashCode;
    private final FIRST mFirst;
    protected ImmutableTuple1(
        final FIRST first
    ) {
      mFirst = first;
      mToString = String.format(FORMAT, first);
      mHashCode = Objects.hashCode(mFirst);
    }
    public FIRST first() { return mFirst; }
    public String toString() { return mToString; }
    public int hashCode() { return mHashCode; }
    public boolean equals(final Object obj) {
      if ((null == obj) || (getClass() != obj.getClass())) {
        return false;
      } else {
        final ImmutableTuple1 that = (ImmutableTuple1) obj;
        return Objects.equal(this.mFirst, that.mFirst);
      }
    }
  }
  public class MutableTuple1<FIRST> {
    private FIRST mFirst;
    protected MutableTuple1() { }
    protected MutableTuple1(
      final FIRST first
    ) {
      mFirst = first;
    }
    public FIRST first() { return mFirst; }
    public FIRST setFirst(final FIRST newFirst) { final FIRST oldFirst = mFirst; mFirst = newFirst; return oldFirst; }
    public String toString() { return String.format(FORMAT, mFirst); }
    public int hashCode() { return Objects.hashCode(mFirst); }
    public boolean equals(final Object obj) {
      if (null == obj || getClass() != obj.getClass()) {
        return false;
      } else {
        final MutableTuple1 that = (MutableTuple1) obj;
        return Objects.equal(this.mFirst, that.mFirst);
      }
    }
  }
}
    
