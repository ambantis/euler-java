package net.euler;

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



  }

}
