package net.euler;

/**
 * Sum square difference
 *
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers
 * and the square of the sum is 3025 − 385 = 2640. Find the difference between the sum of the squares
 * of the first one hundred natural numbers and the square of the sum.
 *
 * User: Alexandros Bantis
 * Date: 2/25/13
 * Time: 5:57 PM
 */
public class Problem006 {

  private long N;

  public Problem006(long N) {
    this.N = N;
  }

  public long calc() {
    return square(sigma()) - sigmaSquare();
  }

  private long sigma() {
    long value = 0;
    for (long i = 1; i < N+1; i++)
      value += i;
    return value;
  }

  private long square(long val) {
    return val * val;
  }

  private long sigmaSquare() {
    long value = 0;
    for (long i = 1; i < N+1; i++)
      value += square(i);
    return value;
  }


}
