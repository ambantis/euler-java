package net.euler;
import net.euler.Stopwatch.*;
import static net.euler.Problem001.*;
import static net.euler.Problem002.*;
import static net.euler.Problem003.*;
import static net.euler.Problem004.*;


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
    System.out.println(" with a time of " + sumMultiplesTime + " seconds.\n");

    Stopwatch stopwatch002 = new Stopwatch();
    int sumFiboNumbersOutput = sumEvenFiboNumbersTo(4000000);
    double sumFiboNumbersTime = stopwatch002.elapsedTime();
    System.out.println("Problem #002");
    System.out.println("============");
    System.out.print("The sum of even Fibonacci numbers that do not exceed 4 million = ");
    System.out.print(sumFiboNumbersOutput);
    System.out.println(" with a time of " + sumFiboNumbersTime + " seconds.\n");

    Stopwatch stopwatch003 = new Stopwatch();
    Long largestPrimeFactorOutput = largestPrimeFactorOf(600851475143L);
    double largestPrimeFactorTime = stopwatch003.elapsedTime();
    System.out.println("Problem #003");
    System.out.println("============");
    System.out.print("The largest prime factor of 600851475143 = ");
    System.out.print(largestPrimeFactorOutput);
    System.out.println(" with a time of " + largestPrimeFactorTime + " seconds.\n");

    Stopwatch stopwatch004 = new Stopwatch();
    int largestPalindromeProductOutput = largestPalindromeProduct(1000);
    double largestPalindromeProductTime = stopwatch004.elapsedTime();
    System.out.println("Problem #004");
    System.out.println("============");
    System.out.print("The largest palindromic product of 3-digit numbers is = ");
    System.out.print(largestPalindromeProductOutput);
    System.out.println(" with a time of " + largestPalindromeProductTime + " seconds.\n ");
  }

}
