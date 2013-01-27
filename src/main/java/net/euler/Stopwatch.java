package net.euler;

/**
 * User: Alexandros Bantis
 * Date: 1/26/13
 * Time: 7:51 PM
 */
public class Stopwatch {
  private final long start;

  public Stopwatch() {
    start = System.currentTimeMillis();
  }

  public double elapsedTime() {
    long now = System.currentTimeMillis();
    return (now - start) / 1000.0;
  }

}
