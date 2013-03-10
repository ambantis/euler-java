package net.euler;

import java.math.BigInteger;

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

    Stopwatch stopwatch005 = new Stopwatch();
    int highestMultiple = 20;
    int findSmallestMultipleElegantOutput = findSmallestMultiple(highestMultiple);
    double findSmallestMultipleElegantTime = stopwatch005.elapsedTime();
    System.out.println("Problem #005");
    System.out.println("============");
    System.out.print("Using Elegance, the multiple of the numbers 1-" + highestMultiple + " is = ");
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

    Stopwatch stopwatch008 = new Stopwatch();
    Problem008 problem008 = new Problem008();
    int maxProductOutput = problem008.largestProduct();
    double maxProductTime = stopwatch008.elapsedTime();
    System.out.println("Problem #008");
    System.out.println("============");
    System.out.print("The max product of the string is = ");
    System.out.print(maxProductOutput);
    System.out.println(" with a time of " + maxProductTime + " milliseconds.\n ");

    Stopwatch stopwatch009 = new Stopwatch();
    Problem009 problem009 = new Problem009();
    int pythagoreanTripletOutput = problem009.tripletProduct();
    double pythagoreanTripletTime = stopwatch009.elapsedTime();
    System.out.println("Problem #009");
    System.out.println("============");
    System.out.print("The pythagorean triplet product where sum of sides is 1000 = ");
    System.out.print(pythagoreanTripletOutput);
    System.out.println(" with a time of " + pythagoreanTripletTime + " milliseconds.\n ");

    Stopwatch stopwatch010 = new Stopwatch();
    int ceiling = 2000000;
    Problem010 problem010 = new Problem010(ceiling);
    long primeSumOutput = problem010.sumPrimes();
    double primeSumTime = stopwatch010.elapsedTime();
    System.out.println("Problem #010");
    System.out.println("============");
    System.out.print("The sum of primes below " + ceiling + " = ");
    System.out.print(primeSumOutput);
    System.out.println(" with a time of " + primeSumTime + " milliseconds.\n ");

    Stopwatch stopwatch011 = new Stopwatch();
    Problem011 problem011 = new Problem011();
    int gridMaxOutput = problem011.calcAllMax();
    double gridMaxTime = stopwatch011.elapsedTime();
    System.out.println("Problem #011");
    System.out.println("============");
    System.out.print("The greatest product of four adjacent numbers in the matrix = ");
    System.out.print(gridMaxOutput);
    System.out.println(" with a time of " + gridMaxTime + " milliseconds.\n ");

    Stopwatch stopwatch012 = new Stopwatch();
    Problem012 problem012 = new Problem012();
    long triangleNumberOutput = problem012.getNaturalNumberWith(500);
    double triangleNumberTime = stopwatch012.elapsedTime();
    System.out.println("Problem #012");
    System.out.println("============");
    System.out.print("The first triangle number with over 500 divisors = ");
    System.out.print(triangleNumberOutput);
    System.out.println(" with a time of " + triangleNumberTime + " milliseconds.\n ");

    Stopwatch stopwatch013 = new Stopwatch();
    Problem013 problem013 = new Problem013();
    String bigSumOutput = problem013.firstTen();
    double bigSumTime = stopwatch013.elapsedTime();
    System.out.println("Problem #013");
    System.out.println("============");
    System.out.println("The first ten digits of the big sum = " + bigSumOutput);
    System.out.println(" with a time of " + bigSumTime + " milliseconds.\n ");

    Stopwatch stopwatch014 = new Stopwatch();
    int collatzSeqLength = 1000000;
    Problem014 problem014 = new Problem014();
    long collatzOutput = problem014.getMaxCollatz(collatzSeqLength);
    double collatzTime = stopwatch014.elapsedTime();
    System.out.println("Problem #014");
    System.out.println("============");
    System.out.println("The max Collatz sequence to " + collatzSeqLength + " = " + collatzOutput);
    System.out.println(" with a time of " + collatzTime + " milliseconds.\n ");

    Stopwatch stopwatch015 = new Stopwatch();
    long size = 20;
    Problem015 problem015 = new Problem015();
    long latticeOutput = problem015.latticePaths(size);
    double latticeTime = stopwatch015.elapsedTime();
    System.out.println("Problem #015");
    System.out.println("============");
    System.out.println("The number of paths for a lattice of " + size + "x" + size + " = " + latticeOutput);
    System.out.println(" with a time of " + latticeTime + " milliseconds.\n ");
  }
}
