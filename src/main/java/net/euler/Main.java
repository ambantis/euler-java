package net.euler;

import static net.euler.Problem001.*;
import static net.euler.Problem002.*;
import static net.euler.Problem003.*;
import static net.euler.Problem004.*;
import static net.euler.Problem005.*;

/**
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 4:47 PM
 */
public class Main {

  public static void main(String[] args) {
    Stopwatch stopwatch001 = new Stopwatch();
    int sumMultiplesOutput = sumMultiplesOf3And5(1000);
    double sumMultiplesTime = stopwatch001.elapsedTime();
    System.out.println("Problem #001");
    System.out.println("============");
    System.out.print("The sum of all the multiples of 3 or 5 below 1000 = ");
    System.out.print(sumMultiplesOutput);
    System.out.println(" with a time of " + sumMultiplesTime + " milliseconds.\n");

    Stopwatch stopwatch002 = new Stopwatch();
    int sumFiboNumbersOutput = sumEvenFiboNumbersTo(4000000);
    double sumFiboNumbersTime = stopwatch002.elapsedTime();
    System.out.println("Problem #002");
    System.out.println("============");
    System.out.print("The sum of even Fibonacci numbers that do not exceed 4 million = ");
    System.out.print(sumFiboNumbersOutput);
    System.out.println(" with a time of " + sumFiboNumbersTime + " milliseconds.\n");

    Stopwatch stopwatch003 = new Stopwatch();
    Long largestPrimeFactorOutput = largestPrimeFactorOf(600851475143L);
    double largestPrimeFactorTime = stopwatch003.elapsedTime();
    System.out.println("Problem #003");
    System.out.println("============");
    System.out.print("The largest prime factor of 600851475143 = ");
    System.out.print(largestPrimeFactorOutput);
    System.out.println(" with a time of " + largestPrimeFactorTime + " milliseconds.\n");

    Stopwatch stopwatch004 = new Stopwatch();
    int largestPalindromeProductOutput = largestPalindromeProduct(1000);
    double largestPalindromeProductTime = stopwatch004.elapsedTime();
    System.out.println("Problem #004");
    System.out.println("============");
    System.out.print("The largest palindromic product of 3-digit numbers is = ");
    System.out.print(largestPalindromeProductOutput);
    System.out.println(" with a time of " + largestPalindromeProductTime + " milliseconds.\n ");

    Stopwatch stopwatch005a = new Stopwatch();
    int highestMultiple = 20;
    int findSmallestMultipleBruteOutput = findSmallestMultipleBruteForce(highestMultiple);
    double findSmallestMultipleTime = stopwatch005a.elapsedTime();
    System.out.println("Problem #005a");
    System.out.println("============");
    System.out.print("Using Brute Force, the multiple of the numbers 1-" + highestMultiple + " is = ");
    System.out.print(findSmallestMultipleBruteOutput);
    System.out.println(" with a time of " + findSmallestMultipleTime + " milliseconds.\n ");

    Stopwatch stopwatch005b = new Stopwatch();
    int findSmallestMultipleElegantOutput = findSmallestMultiple(highestMultiple);
    double findSmallestMultipleElegantTime = stopwatch005b.elapsedTime();
    System.out.println("Problem #005b");
    System.out.println("============");
    System.out.print("Using Elegance Force, the multiple of the numbers 1-" + highestMultiple + " is = ");
    System.out.print(findSmallestMultipleElegantOutput);
    System.out.println(" with a time of " + findSmallestMultipleElegantTime + " milliseconds.\n ");

    Stopwatch stopwatch006 = new Stopwatch();
    long sumSquareDifferenceTo = 100;
    Problem006 problem006 = new Problem006(sumSquareDifferenceTo);
    long sumSquareDifferenceOutput = problem006.calc();
    double sumSquareDifferenceTime = stopwatch006.elapsedTime();
    System.out.println("Problem #006");
    System.out.println("============");
    System.out.print("The sum square difference of 1 to " + sumSquareDifferenceTo + " is = ");
    System.out.print(sumSquareDifferenceOutput);
    System.out.println(" with a time of " + sumSquareDifferenceTime + " milliseconds.\n ");

    Stopwatch stopwatch007 = new Stopwatch();
    int nthPrimeCount = 10001;
    Problem007 problem007 = new Problem007();
    long nthPrimeOutput = problem007.nthPrime(nthPrimeCount);
    double nthPrimeTime = stopwatch007.elapsedTime();
    System.out.println("Problem #007");
    System.out.println("============");
    System.out.print("The " + nthPrimeCount + "th is = ");
    System.out.print(nthPrimeOutput);
    System.out.println(" with a time of " + nthPrimeTime + " milliseconds.\n ");
  }
}
