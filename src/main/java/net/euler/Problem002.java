package net.euler;

import java.util.Stack;

/**
 * Even Fibonacci numbers
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 *
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 5:14 PM
 */
public class Problem002 {
  private static Stack<Integer> numbers = null;

  private static void initializeFiboSequence(int ceiling) {
    numbers = new Stack<Integer>();
    int lastFibo = 2;
    int nextFibo;
    numbers.push(1);
    numbers.push(lastFibo);
    while (true) {
      lastFibo = numbers.pop();
      nextFibo = lastFibo + numbers.peek();
      numbers.push(lastFibo);
      if (nextFibo < ceiling)
        numbers.push(nextFibo);
      else
        return;
    }
  }

  public static Integer sumEvenFiboNumbersTo(int ceiling) {
    initializeFiboSequence(ceiling);
    int sum = 0;
    for (Integer number : numbers)
      if (number % 2 == 0)
        sum += number;
    return sum;
  }

}
