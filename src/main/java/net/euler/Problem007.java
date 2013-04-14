package net.euler;

/**
 * 10001st Prime
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 * User: Alexandros Bantis
 * Date: 2/25/13
 * Time: 6:32 PM
 */
public class Problem007 {

  public long nthPrime(int n) {
    long i;
    long prime = 2;
    int primeCount = 1;
    while (primeCount < n) {
      for (i = prime + 1; !isPrime(i); i++) {}
      primeCount++;
      prime = i;
    }
    return prime;
  }

  public boolean isPrime(long n) {
    if (n < 2)
      return false;
    long ceiling = roughRoot(n);
    for (long i = 2; i < ceiling + 1; i++)
      if (n % i == 0)
        return false;
    return true;
  }

  private long roughRoot(long number) {
    long i;
    for (i = 1L; i * i < number; i++) {}
    return i;
  }


}
