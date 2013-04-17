package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 4/16/13
 * Time: 6:54 PM
 */
@RunWith(JUnit4.class)
public class Problem028Test {
  @Test
  public void spiralToFive() {
    Problem028 problem028 = new Problem028();
    int size = 5;
    int expected = 101;
    int actual = problem028.calcDiagonals(size);
    assertEquals("failure - should be 101", expected, actual);

  }

}
