package nsl;

import nsl.MutableTuple.Tuple1Builder;
import nsl.Tuple.Tuple1;
import org.junit.Assert;
import org.junit.Test;

public class TestMutableTuple {

  private static final class MySingle extends Tuple1<Integer> {
    private static final String FORMAT = "MySingle: %s";
    private final String mToString;
    protected MySingle(final Integer integer) {
      super(integer);
      mToString = String.format(FORMAT, super.toString());
    }
    public Integer getId() { return mFirst; }
    @Override
    public String toString() {
      return mToString;
    }
  }

  private static final class MySingleBuilder extends Tuple1Builder<Integer> {
    public Integer setId(final Integer newId) {
      final Integer oldId = mFirst;
      mFirst = newId;
      return oldId;
    }
    public Integer getId() {
      return mFirst;
    }
    @Override
    public MySingle freeze() {
      return new MySingle(mFirst);
    }
  }

  @Test
  public void testMySingleBuilder() {
    final MySingle ms1 = new MySingle(1);
    final MySingleBuilder msBuilder = new MySingleBuilder();
    try {
      msBuilder.freeze();
      Assert.fail("should have thrown null pointer exception.");
    } catch (NullPointerException npe) {
      // pass.
    }
    msBuilder.setId(1);
    final MySingle ms2 = msBuilder.freeze();
    Assert.assertEquals(ms1, ms2);
  }
}
