package net.euler;

import java.util.ArrayList;

/**
 * Smallest Multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * User: Alexandros Bantis
 * Date: 1/29/13
 * Time: 7:06 PM
 */
public class Problem005 {

  private static ArrayList<Integer> divisors;

  private static void initializeDivisors(int ceiling) {
    divisors = new ArrayList<Integer>();
    for (Integer i = 1; i <= ceiling; i++)
      divisors.add(i);
  }

  private static boolean isDivisibleByAll(int n) {
    for (int divisor : divisors)
      if (n % divisor != 0)
        return false;
    return true;
  }

  public static int findSmallestMultiple (int ceiling) {
    initializeDivisors(ceiling);
    int number = 1;
    while (!isDivisibleByAll(number))
      number++;
    return number;
  }

}
