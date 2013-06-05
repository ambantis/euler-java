package net.euler;

import net.euler.Problem024.*;
/**
 * Circular Primes
 *
 * The number, 197, is called a circular prime because all rotations of the digits:
 * 197, 971, and 719, are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 *
 * User: Alexandros Bantis
 * Date: 5/30/13
 * Time: 12:08 AM
 */
public class Problem035 {

  public int countCircularPrimes() {
    int count = 0;
    for (Integer i = 0; i < 1000000; i++) {
      Problem024 problem024 = new Problem024(i.toString());
      problem024.generatePermutations();
    }
    return 0;
  }

}
