package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 2/25/13
 * Time: 6:13 PM
 */
@RunWith(JUnit4.class)
public class Problem006Test {

  @Test
  public void testSumSquareDifference() {
    long expectedValue = 2640;
    Problem006 prob = new Problem006(10);
    long actualValue = prob.calc();
    assertEquals("failure - should equal 2,640", expectedValue, actualValue);
  }
}
