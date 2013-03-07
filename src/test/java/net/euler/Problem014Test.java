package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 3/6/13
 * Time: 11:24 PM
 */
@RunWith(JUnit4.class)
public class Problem014Test {

  @Test
  public void testCollatzSequence() {
    int number = 13;
    int expected = 10;
    Problem014 problem014 = new Problem014();
    int actual = problem014.getCollatzSequenceLength(number);
    assertEquals("failure - should equal 10", expected, actual);
  }
}
