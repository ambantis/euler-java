package net.euler;

import java.util.HashSet;

/**
 * Truncatable primes
 *
 * The number 3797 has an interesting property. Being prime itself, it is
 * possible to continuously remove digits from left to right, and remain
 * prime at each stage: 3797, 797, 97, and 7. Similarly, we can work from
 * right to left: 3797, 379, 37, and 3.
 *
 * Find the sum of the only eleven primes that are both truncatable from
 * left to right and right to left. (Note: 2,3,5,7 are not considered to
 * be truncatable primes.)
 *
 * User: Alexandros Bantis
 * Date: 6/4/13
 * Time: 6:33 PM
 */
public class Problem037 {
  private HashSet<Integer> primes;
  private final int MAX = 2000000;

  public Problem037() {
    primesToMax();
  }

  public int getTruncatablePrimeCount() {
    int count = 0;
    for (int i = 10; i < MAX; i++)
      if (isTruncatablePrime(i)) {
        count++;
      }
    return count;
  }

  public int getTruncatablePrimeSum() {
    int result = 0;
    for (int i = 10; i < MAX; i++)
      if (isTruncatablePrime(i))
        result += i;
    return result;
  }

  public boolean isTruncatablePrime(int n) {
    int val;

    if (!isPrime(n))
      return false;

    val = n;
    while ((val = leftTruncate(val)) > 0)
      if (!isPrime(val))
        return false;

    val = n;
    while (((val = rightTruncate(val)) > 0))
      if (!isPrime(val))
        return false;

    return true;
  }

  public int leftTruncate(Integer n) {
    int result = 0;
    char[] chars = n.toString().toCharArray();
    for (int i = 1; i < chars.length; i++)
      result = result * 10 + (chars[i] - '0');
    return result;
  }

  public int rightTruncate(Integer n) {
    int result = 0;
    char[] chars = n.toString().toCharArray();
    for (int i = 0; i < chars.length-1; i++)
      result = result * 10 + (chars[i] - '0');
    return result;
  }

  public boolean isPrime(int n) {
    return primes.contains(n);
  }

  public void primesToMax() {
    primes = new HashSet<Integer>();
    int[] sieve = new int[MAX];
    int ceiling = (int) Math.sqrt(MAX);
    for (int i = 2; i < MAX; i++)
      sieve[i] = 1;
    for (int i = 2; i < ceiling; i++)
      for (int j = 2; i*j < MAX; j++)
        if (sieve[i*j] == 1)
          sieve[i*j] = 0;
    for (int i = 2; i < MAX; i++)
      if (sieve[i] == 1 && !primes.contains(i))
        primes.add(i);
  }

  public int intPow(int base, int exp) throws IllegalArgumentException {
    if (exp < 0)
      throw new IllegalArgumentException("exponent must be non-negative");
    int result = 1;
    for (int i = 0; i < exp; i++) {
      result *= base;
    }
    return result;
  }

}
