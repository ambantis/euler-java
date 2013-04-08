package net.euler;

/**
 * Reciprocal cycles
 *
 * A unit fraction contains 1 in the numerator. The decimal representation of
 * the unit fractions with denominators 2 to 10 are given:
 *
 *   1/2	= 	0.5
 *   1/3	= 	0.(3)
 *   1/4	= 	0.25
 *   1/5	= 	0.2
 *   1/6	= 	0.1(6)
 *   1/7	= 	0.(142857)
 *   1/8	= 	0.125
 *   1/9	= 	0.(1)
 *   1/10	= 	0.1
 *
 *  Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
 *  It can be seen that 1/7 has a 6-digit recurring cycle.
 *
 *  Find the value of d < 1000 for which 1/d contains the longest recurring
 *  cycle in its decimal fraction part.
 *
 * User: Alexandros Bantis
 * Date: 4/6/13
 * Time: 7:58 PM
 */
public class Problem026 {
  int numerator;
  private int denominator;
  private Integer quotient;
  private int modulo;
  private int patternMod;
  private StringBuilder cumQuot;
  private StringBuilder pattern;

  public Problem026() {
    numerator = 1;
    cumQuot = new StringBuilder();
    pattern = new StringBuilder();
  }

  public int calcMaxPatternTo(int ceiling) {
    Integer maxPatternLength = 0;
    Integer maxPatternAt = 0;
    int currentPatternLength;
    for (int i = 2; i < ceiling; i++) {
      currentPatternLength = calcPatternLength(i);
      if (currentPatternLength > maxPatternLength) {
        maxPatternLength = currentPatternLength;
        maxPatternAt = i;
      }
    }
    return maxPatternAt;
  }

  /**
   * calcPatternLength
   *
   * calculates the length of the repeating decimal pattern of a given unit
   * decimal.
   *
   * @param next the next unit decimal's denominator
   * @return returns 0 if unit fraction is terminating
   *         otherwise the length of the repeating decimal
   */
  public int calcPatternLength(int next) {
    clearCumQuot();
    clearPattern();
    numerator = 1;
    denominator = next;
    modulo = 1;
    while (hasMoreDigits()) {
      nextDigit();
      if (patternIsComplete())
        return pattern.length();
      addDigitToPattern();
      if (!patternExists())
        clearPattern();
      addDigitToCumQUot();
    }
    return 0;
  }

  /**
   * patternExists
   *
   * Evaluates whether quotient pattern exists within cumQuot
   * @return true if the decimal pattern exists within the cumulative quotient
   */
  private boolean patternExists() {
    return pattern.length() > 0 &&
        cumQuot.indexOf(pattern.toString()) > -1;
  }

  /**
   * patternIsComplete
   *
   * Evaluates whether a complete pattern has been proven to exist
   * @return true if there is a pattern, which exists within the cumulative
   *              quotient and the modulo at the beginning of the pattern
   *              matches the modulo one digit past the end of the pattern.
   */
  private boolean patternIsComplete() {
    return pattern.length() > 0 &&
        cumQuot.indexOf(pattern.toString()) > -1 &&
        modulo == patternMod;
  }

  private boolean hasMoreDigits() {
    return modulo > 0;
  }

  private void nextDigit() {
    numerator = modulo * 10;
    quotient = numerator / denominator;
    modulo = numerator % denominator;
  }

  private void addDigitToPattern() {
    if (pattern.length() == 0)
      patternMod = modulo;
    pattern.append(quotient);
  }

  private void addDigitToCumQUot() {
    cumQuot.append(quotient);
  }

  private void clearPattern() {
    pattern.setLength(0);
  }

  private void clearCumQuot() {
    cumQuot.setLength(0);
  }

}
