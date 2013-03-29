package net.euler;

import java.math.BigInteger;
import java.util.ArrayDeque;


/**
 * The Fibonacci sequence is defined by the recurrence relation:
 *
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 *
 * Hence the first 12 terms will be:
 *   F1 = 1
 *   F2 = 1
 *   F3 = 2
 *   F4 = 3
 *   F5 = 5
 *   F6 = 8
 *   F7 = 13
 *   F8 = 21
 *   F9 = 34
 *   F10 = 55
 *   F11 = 89
 *   F12 = 144
 *
 * The 12th term, F12, is the first term to contain three digits.
 *
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 *
 * User: Alexandros Bantis
 * Date: 3/28/13
 * Time: 5:41 PM
 */
public class Problem025 {

  private ArrayDeque<BigInteger> fibos;

  public Problem025() {
    fibos = new ArrayDeque<BigInteger>();
    fibos.push(BigInteger.ONE);
    fibos.push(BigInteger.ONE);
  }

  public int calcFirstFiboWith(int digits) {
    if (digits < 2)
      return 1;
    int nth;
    for (nth = 3; getHeadFiboLength() < digits; nth++)
      addAnotherFibo();
    return nth;
  }

  private int getHeadFiboLength() {
    return fibos.peekFirst().toString().length();
  }

  private void addAnotherFibo() {
    BigInteger lastTerm = fibos.pop();
    BigInteger penultimateTerm = fibos.peek();
    fibos.push(lastTerm);
    fibos.push(lastTerm.add(penultimateTerm));
  }
}
