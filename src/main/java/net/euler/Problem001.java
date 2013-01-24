package net.euler;

import java.util.ArrayList;

/**
 * Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 and 5, we get 3, 5, 6, 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 and 5 below 1000.
 *
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 4:13 PM
 */
public class Problem001 {
  private static ArrayList<Integer> multiples = null;

  private static void initializeMultiplesOf3And5List (int ceiling) {
    int three = 3;
    int five = 5;
    multiples = new ArrayList<Integer>(ceiling);
    for (int i = 0; i < ceiling; i++)
      if (i % three == 0 || i % five == 0)
        multiples.add(i);
  }

  public static int sumMultiplesOf3And5(int ceiling) {
    initializeMultiplesOf3And5List(ceiling);
    int sum = 0;
    for (Integer multiple : multiples)
      sum += multiple;
    return sum;
  }
}
