package net.euler;

import java.math.BigInteger;
import java.util.LinkedList;

/**
 * Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13, 29. What is the largest prime factor of the number 600851475143?
 *
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 6:30 PM
 */
public class Problem003 {

  private static LinkedList<BigInteger> factors;

  private static BigInteger bigIntRoughRoot(BigInteger number) {
    BigInteger i = BigInteger.ONE;
    while (number.compareTo(i.pow(2)) > 0)
      i = i.add(BigInteger.ONE);
    return i;
  }

  private static void initializePrimeFactorList(BigInteger number) {
    BigInteger i = new BigInteger("2");
    BigInteger ceiling = bigIntRoughRoot(number);
    BigInteger rem = number;
    factors = new LinkedList<BigInteger>();
    while (i.compareTo(ceiling) < 0) {
      if (rem.mod(i).equals(BigInteger.ZERO)) {
        factors.add(i);
        rem = rem.divide(i);
      } else {
        i = i.add(BigInteger.ONE);
      }
    }
  }

  public static int largestPrimeFactorOf(BigInteger number) {
    initializePrimeFactorList(number);
    BigInteger result = BigInteger.ZERO;
    for (BigInteger bigInteger : factors)
      result = result.max(bigInteger);
    return result.intValue();
  }

}
