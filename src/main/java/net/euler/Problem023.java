package net.euler;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Non-abundant sums
 *
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28,
 * which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant
 * if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written
 * as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers
 * greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be
 * reduced any further by analysis even though it is known that the greatest number that cannot be expressed
 * as the sum of two abundant numbers is less than this limit. Find the sum of all the positive integers
 * which cannot be written as the sum of two abundant numbers.

 * User: Alexandros Bantis
 * Date: 3/25/13
 * Time: 9:06 PM
 */
public class Problem023 {

  private ConcurrentSkipListSet<Integer> abundantNumbers;

  Problem023() {
    abundantNumbers = new ConcurrentSkipListSet<Integer>();
    abundantNumbers.add(12);
  }

  public long sumOfNotAbundantSumNumbers() {
    final int MAX_ABUNDANT = 28123;
    long sum = 0;
    for (int i = 1; i < MAX_ABUNDANT+1; i++)
      if (!isSumOfAbundantPair(i))
        sum += i;
    return sum;
  }

  public void addAbundant() {
    int i = abundantNumbers.last();
    while (true) {
      if (abundant(++i)) {
        abundantNumbers.add(i);
        break;
      }
    }
  }

  public boolean isSumOfAbundantPair(int n) {
    while (abundantNumbers.first() + abundantNumbers.last() < n)
      addAbundant();

    for (Integer abundant : abundantNumbers)
      if (abundantNumbers.contains(n - abundant)) {
        return true;
      }
    return false;
  }

  public boolean abundant(int n) {
    int sum = -n;
    double ceiling = (int) (Math.sqrt(n * 1.0)+1);
    for (int i = 1; i < ceiling; i++) {
      if (n % i == 0) {
        sum += (i*i == n) ? i : i + (n / i);
      }
    }
    return sum > n;
  }

  public int countAbundantNumbersTo(int n) {
    abundantNumbers.clear();
    for (int i = 0; i < n; i++)
      if (abundant(i))
        abundantNumbers.add(i);
    int count = 0;
    for (Integer abundant : abundantNumbers) {
      if (n < abundant)
        break;
      count++;
    }
    return count;
  }
}
