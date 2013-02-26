package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 2/25/13
 * Time: 7:16 PM
 */
@RunWith(JUnit4.class)
public class Problem007Test {

  @Test
  public void testNthPrime() {
    long expectedValue = 13;
    Problem007 problem007 = new Problem007();
    long actualValue = problem007.nthPrime(6);
    assertEquals("failure - should equal 13", expectedValue, actualValue);
  }
}
