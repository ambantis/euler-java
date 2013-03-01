package net.euler;

/**
 * Summation of primes
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
 *
 * Find the sum of all the primes below two million
 * User: Alexandros Bantis
 * Date: 2/28/13
 * Time: 9:25 PM
 */
public class Problem010 {
  final private int CROSSED_OUT = 0;
  final private int NOT_CROSSED_OUT = 1;
  private int N;
  int[] sieve;

  public Problem010(int limit) {
    N = limit;
    sieve = new int[N];
    for (int i = 2; i < N; i++)
      sieve[i] = NOT_CROSSED_OUT;
    doSieve();
  }

  public long sumPrimes() {
    long sum = 0;
    for (int i = 2; i < N; i++)
      if (sieve[i] == NOT_CROSSED_OUT)
        sum += i;
    return sum;
  }

  private void doSieve() {
    int ceiling = (int) Math.sqrt(N * 1.0) + 1;
    // cross out sieve values
    for (int i = 2; i < ceiling; i++)
      for (int j = 2; i*j < N; j++)
        sieve[i*j] = CROSSED_OUT;
  }
}
