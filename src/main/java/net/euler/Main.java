package net.euler;

import java.math.BigInteger;

/**
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 4:47 PM
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Problem #001");
    System.out.println("============");
    System.out.print("The sum of all the multiples of 3 or 5 below 1000 = ");
    System.out.println(net.euler.Problem001.sumMultiplesOf3And5(1000));

    System.out.println("Problem #002");
    System.out.println("============");
    System.out.print("The sum of even Fibonacci numbers that do not exceed 4 million = ");
    System.out.println(net.euler.Problem002.sumEvenFiboNumbersTo(4000000));

    System.out.println("Problem #003");
    System.out.println("============");
    System.out.print("The largest prime factor of 600851475143 = ");
    System.out.println(net.euler.Problem003.largestPrimeFactorOf(new BigInteger("600851475143")));

    System.out.println("Problem #004");
    System.out.println("============");
    System.out.print("The largest palindromic product of 3-digit numbers is = ");
    System.out.println(net.euler.Problem004.largestPalindromeProduct(1000));


  }

}
