package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 3/27/13
 * Time: 2:36 PM
 */
@RunWith(JUnit4.class)
public class Problem024Test {

  @Test
  public void testNumberOfPermutationsLen3() {
    String input = "012";
    int expected = 6;
    Problem024 problem024 = new Problem024(input);
    problem024.generatePermutations();
    int actual = problem024.getNumberPermutations();
    assertEquals("failure - should equal 6", expected, actual);
  }

  @Test
  public void test123Permutation3() {
    String input = "012";
    Problem024 problem024 = new Problem024(input);
    String expected = "102";
    problem024.generatePermutations();
    String actual = problem024.getPermutation(2);
    assertEquals("failure - should equal '102'", expected, actual);
  }

  @Test
  public void testNumberOfPermutationsLen5() {
    String input = "01234";
    int expected = 120;
    Problem024 problem024 = new Problem024(input);
    problem024.generatePermutations();
    int actual = problem024.getNumberPermutations();
    assertEquals("failure - should equal " + expected, expected, actual);
  }

  @Test
  public void testNumberOfPermutationsLen7() {
    String input = "0123456";
    int expected = 5040;
    Problem024 problem024 = new Problem024(input);
    problem024.generatePermutations();
    int actual = problem024.getNumberPermutations();
    assertEquals("failure - should equal " + expected, expected, actual);
  }

  @Test
  public void test123456Permutation1() {
    String input = "0123456";
    Problem024 problem024 = new Problem024(input);
    String expected = "0123465";
    problem024.generatePermutations();
    String actual = problem024.getPermutation(1);
    assertEquals("failure - should equal " + expected, expected, actual);
  }


  @Test
  public void testNumberOfPermutationsLen8() {
    String input = "01234567";
    int expected = 40320;
    Problem024 problem024 = new Problem024(input);
    problem024.generatePermutations();
    int actual = problem024.getNumberPermutations();
    assertEquals("failure - should equal " + expected, expected, actual);
  }
  @Test
  public void testNumberOfPermutationsLen9() {
    String input = "012345678";
    int expected = 362880;
    Problem024 problem024 = new Problem024(input);
    problem024.generatePermutations();
    int actual = problem024.getNumberPermutations();
    assertEquals("failure - should equal " + expected, expected, actual);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testPermutationsIllegalArgumentException() {
    String input = "01234";
    Problem024 problem024 = new Problem024(input);
    problem024.getNumberPermutations();
  }

}
