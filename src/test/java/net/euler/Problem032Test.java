package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

/**
 * User: Alexandros Bantis
 * Date: 5/26/13
 * Time: 10:34 PM
 */
@RunWith(JUnit4.class)
public class Problem032Test {

  @Test
  public void testIsPandigital() {
    Problem032 problem032 = new Problem032();

    int x = 39;
    int y = 186;
    int z = 7254;
    boolean actual = problem032.isPanDigital(problem032.arrayListOf(x,y,z));
    System.out.println("test returns " + actual);
    assertTrue("failure, 39 x 186 = 7254 should be a pandigital",actual);
  }


}
