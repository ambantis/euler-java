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
    int pythagoreanTripletOutput = problem009.tripletProduct(1000);
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

    Stopwatch stopwatch016 = new Stopwatch();
    int exponent = 1000;
    Problem016 problem016 = new Problem016();
    long powerDigitSumOutput = problem016.sumOfDigits(problem016.bigNumberString(exponent));
    double powerDigitSumTime = stopwatch016.elapsedTime();
    System.out.println("Problem #016");
    System.out.println("============");
    System.out.println("The sum of digits of 2^1000 = " + powerDigitSumOutput);
    System.out.println(" with a time of " + powerDigitSumTime + " milliseconds.\n ");

    Stopwatch stopwatch017 = new Stopwatch();
    ceiling = 1000;
    Problem017 problem017 = new Problem017();
    long letterCountsOutput = problem017.numberLetterCountsTo(ceiling);
    double letterCountsTime = stopwatch017.elapsedTime();
    System.out.println("Problem #017");
    System.out.println("============");
    System.out.println("The number-letter counts for integers 1 to " + ceiling + " = " + letterCountsOutput);
    System.out.println(" with a time of " + letterCountsTime + " milliseconds.\n ");

    Stopwatch stopwatch019 = new Stopwatch();
    Problem019 problem019 = new Problem019();
    long countSundaysOutput = problem019.calcSundays();
    double countSundaysTime = stopwatch019.elapsedTime();
    System.out.println("Problem #019");
    System.out.println("============");
    System.out.println("The number of Sundays in the 20th Century = " + countSundaysOutput);
    System.out.println(" with a time of " + countSundaysTime + " milliseconds.\n ");

    Stopwatch stopwatch020 = new Stopwatch();
    Problem020 problem020 = new Problem020();
    long factorialDigitSumOutput = problem020.factorialSumOfDigits(100);
    double factorialDigitSumTime = stopwatch020.elapsedTime();
    System.out.println("Problem #020");
    System.out.println("============");
    System.out.println("The factorial digit sum of 100! = " + factorialDigitSumOutput);
    System.out.println(" with a time of " + factorialDigitSumTime + " milliseconds.\n ");

    Stopwatch stopwatch021 = new Stopwatch();
    int n = 10000;
    Problem021 problem021 = new Problem021();
    long amicableSumOutput = problem021.amicablePairsTo(n);
    double amicableSumTime = stopwatch021.elapsedTime();
    System.out.println("Problem #021");
    System.out.println("============");
    System.out.println("The sum of all amicable numbers under " + n + " = " + amicableSumOutput);
    System.out.println(" with a time of " + amicableSumTime + " milliseconds.\n ");

    Stopwatch stopwatch022a = new Stopwatch();
    Problem022 problem022a = new Problem022();
    long nameScoresQuickSortOutput = problem022a.runQuickSort("/problem022.txt");
    double nameScoresQuickSortTime = stopwatch022a.elapsedTime();
    System.out.println("Problem #022a");
    System.out.println("============");
    System.out.println("The sum of all name scores (using quick-sort) = " + nameScoresQuickSortOutput);
    System.out.println(" with a time of " + nameScoresQuickSortTime + " milliseconds.\n ");

    Stopwatch stopwatch022b = new Stopwatch();
    Problem022 problem022b = new Problem022();
    long nameScoresMergeSortOutput = problem022b.runRecursiveMergeSort("/problem022.txt");
    double nameScoresMergeSortTime = stopwatch022b.elapsedTime();
    System.out.println("Problem #022b");
    System.out.println("============");
    System.out.println("The sum of all name scores (using recursive merge-sort) = " + nameScoresMergeSortOutput);
    System.out.println(" with a time of " + nameScoresMergeSortTime + " milliseconds.\n ");

    Stopwatch stopwatch023 = new Stopwatch();
    Problem023 problem023 = new Problem023();
    long sumNonAbundantOutput = problem023.sumOfNotAbundantSumNumbers();
    double sumNonAbundantTime = stopwatch023.elapsedTime();
    System.out.println("Problem #023");
    System.out.println("============");
    System.out.println("The count of all numbers that are not the sum of 2 abundant numbers =" + sumNonAbundantOutput);
    System.out.println(" with a time of " + sumNonAbundantTime + " milliseconds.\n ");

    Stopwatch stopwatch024 = new Stopwatch();
    int nth = 1000000;
    String input = "0123456789";
    Problem024 problem024 = new Problem024(input);
    problem024.generatePermutations();
    String lexiPermutationsOutput = problem024.getPermutation(nth-1);
    double lexiPermutationsTime = stopwatch024.elapsedTime();
    System.out.println("Problem #024");
    System.out.println("============");
    System.out.println("The " + nth + "th lexicographic permutation of '" + input + "' = " + lexiPermutationsOutput);
    System.out.println(" with a time of " + lexiPermutationsTime + " milliseconds.\n ");

    Stopwatch stopwatch025 = new Stopwatch();
    int thousandDigits = 1000;
    Problem025 problem025 = new Problem025();
    int fiboNthOutput = problem025.calcFirstFiboWith(thousandDigits);
    double fiboNthTime = stopwatch025.elapsedTime();
    System.out.println("Problem #025");
    System.out.println("============");
    System.out.println("The nth Fibo number with " + thousandDigits + " = " + fiboNthOutput);
    System.out.println(" with a time of " + fiboNthTime + " milliseconds.\n ");

    Stopwatch stopwatch026 = new Stopwatch();
    int maxDenominator = 999;
    Problem026 problem026 = new Problem026();
    int greatestPatternOutput = problem026.calcMaxPatternTo(maxDenominator+1);
    double greatestPatternTime = stopwatch026.elapsedTime();
    System.out.println("Problem #026");
    System.out.println("============");
    System.out.println("The greatest pattern length with denominator = " + greatestPatternOutput);
    System.out.println(" with a time of " + greatestPatternTime + " milliseconds.\n ");

    Stopwatch stopwatch027 = new Stopwatch();
    int floor = -999;
    ceiling = 999;
    Problem027 problem027 = new Problem027(floor, ceiling);
    int greatestCoefficientOutput = problem027.calcMaxCombo();
    double greatestCoefficientTime = stopwatch027.elapsedTime();
    System.out.println("Problem #027");
    System.out.println("============");
    System.out.println("The coefficient for the max quadratic prime = " + greatestCoefficientOutput);
    System.out.println(" with a time of " + greatestCoefficientTime + " milliseconds.\n ");

    Stopwatch stopwatch028 = new Stopwatch();
    int length = 1001;
    Problem028 problem028 = new Problem028();
    int spiralDiagonalsOutput = problem028.calcDiagonals(length);
    double spiralDiagonalTime = stopwatch028.elapsedTime();
    System.out.println("Problem #028");
    System.out.println("============");
    System.out.println("The sum of diagonals for a spiral of " + length + " by " + length + " = " +
        spiralDiagonalsOutput);
    System.out.println(" with a time of " + spiralDiagonalTime + " milliseconds.\n ");



  }
}
