package net.euler;

import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * User: Alexandros Bantis
 * Date: 6/6/13
 * Time: 5:42 PM
 */
@RunWith(JUnit4.class)
public class Problem039Test {

  Problem039 problem039;

  @Before
  public void setup() {
    problem039 = new Problem039(1000);
  }

  @After
  public void teardown() {
    problem039 = null;
  }

  @Test
  public void testIsCoprime() {
    Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(3, 4);
    Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(25, 45);
    Pair<Integer, Integer> pair3 = new Pair<Integer, Integer>(21, 21);
    assertTrue("failure - " + pair1.getValue0() + " & " + pair1.getValue1() + " are co-prime",
        problem039.isCoprime(pair1));

    assertFalse("failure - " + pair2.getValue0() + " & " + pair2.getValue1() + " are not co-prime",
        problem039.isCoprime(pair2));

    assertFalse("failure - " + pair3.getValue0() + " & " + pair3.getValue1() + " are not co-prime",
        problem039.isCoprime(pair3));
  }

  @Test
  public void testReduce() {
    Pair<Integer, Integer> pair = new Pair<Integer, Integer>(30, 40);
    Pair<Integer, Integer> expected = new Pair<Integer, Integer>(3,4);
    Pair<Integer, Integer> actual = problem039.reduce(pair);
    assertEquals("failure - " + pair.getValue0() + " & " + pair.getValue1() + " should reduce to (3,4)",
        expected, actual);
  }

  @Test
  public void testGetPythagoreanTriple() {
    Pair<Integer, Integer> pair = new Pair<Integer, Integer>(2,1);
    Triplet<Integer, Integer, Integer> expected = new Triplet<Integer, Integer, Integer>(3,4,5);
    Triplet<Integer, Integer, Integer> actual = problem039.getPythagoreanTriple(pair);
    assertEquals("failure - m=2,n=1 should yield 3-4-5", expected, actual);
  }

  @Test
  public void testSolutionCount() {
    int perimeter = 120;
    problem039.populatePrimitiveTriples();
    problem039.populateSolutions();
    int expected = 3;
    ArrayList<Triplet<Integer, Integer, Integer>> solutions = problem039.solutions.get(perimeter);
    int actual = solutions.size();
    assertEquals("failure - perimeter of 120 should have 3 solutions", expected, actual);
  }
}