package net.euler;

import org.junit.Test;
import org.junit.runners.JUnit4;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 3/9/13
 * Time: 7:21 PM
 */
@RunWith(JUnit4.class)
public class Problem015Test {

  @Test
  public void testLattice2() {
    long row = 2;
    long expected = 6;
    Problem015 problem015 = new Problem015();
    long actual = problem015.latticePaths(row);
    assertEquals("failure - should equal 6", expected, actual);
  }

  @Test
  public void testLattice3() {
    long row = 3;
    long expected = 20;
    Problem015 problem015 = new Problem015();
    long actual = problem015.latticePaths(row);
    assertEquals("failure - should equal 20", expected, actual);
  }

  @Test
  public void testLattice4() {
    long row = 4;
    long expected = 70;
    Problem015 problem015 = new Problem015();
    long actual = problem015.latticePaths(row);
    assertEquals("failure - should equal 70", expected, actual);
  }



}
