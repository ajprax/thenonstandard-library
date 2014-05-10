package nsl;

import junit.framework.Assert;
import nsl.Tuple.Tuple2;
import org.junit.Test;

public class TestTuple {

  private static final class MyPair extends Tuple2<String, Integer> {
    private static final String FORMAT = "MyPair: %s";
    private final String mToString;
    public MyPair(final String s, final Integer integer) {
      super(s, integer);
      mToString = String.format(FORMAT, super.toString());
    }
    public String getName() {
      return mFirst;
    }
    public Integer getId() {
      return mSecond;
    }
    @Override
    public String toString() {
      return mToString;
    }
  }

  @Test
  public void testMyPair() {
    final MyPair m = new MyPair("name", 1);
    Assert.assertEquals("MyPair: (name, 1)", m.toString());
    Assert.assertEquals("name", m.getName());
    Assert.assertEquals(Integer.valueOf(1), m.getId());
  }

  private static final class ComplexTuple extends Tuple2<Tuple2<String, Integer>, Double> {
    private static final String FORMAT = "ComplexTuple: %s";
    private final String mToString;
    public ComplexTuple(final Tuple2<String, Integer> stringIntegerTuple2, final Double aDouble) {
      super(stringIntegerTuple2, aDouble);
      mToString = String.format(FORMAT, super.toString());
    }
    public Tuple2<String, Integer> getPair() {
      return mFirst;
    }
    public Double getWeight() {
      return mSecond;
    }
    @Override
    public String toString() {
      return mToString;
    }
  }

  @Test
  public void testComplexTuple() {
    final Tuple2<String, Integer> t2 = new MyPair("one", 2);
    final ComplexTuple c = new ComplexTuple(t2, 3.0);
    Assert.assertEquals("ComplexTuple: (MyPair: (one, 2), 3.0)", c.toString());
    Assert.assertEquals(t2, c.getPair());
    Assert.assertEquals(3.0, c.getWeight());
  }
}
