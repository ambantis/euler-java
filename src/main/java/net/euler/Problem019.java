package net.euler;

/**
 * Counting Sundays
 *
 * You are given the following information:
 *
 *   1 Jan 1900 was a Monday.
 *   Thirty days has September,
 *   April, June and November.
 *   All the rest have thirty-one,
 *   Saving February alone,
 *   Which has twenty-eight, rain or shine.
 *   And on leap years, twenty-nine.
 *
 *   A leap year occurs on any year evenly divisible by 4,
 *   but not on a century unless it is divisible by 400.
 *
 *   How many Sundays fell on the first of the month during the twentieth
 *   century (1 Jan 1901 to 31 Dec 2000)?
 *
 * User: Alexandros Bantis
 * Date: 3/13/13
 * Time: 5:52 PM
 */
public class Problem019 {

  private final int[][] LAST_DAY_OF_MONTH = {
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
      {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  };

  private int year;
  private int month;
  private int day;

  public Problem019() {
    year = 1900;
    month = 1;
    day = 1;
  }

  public int calcSundays() {
    int count = 0;
    for (int i = 1; !isEndDate(); i++, incDay())
      if (i % 7 == 0 && day == 1 && year > 1900) {
        count++;
      }
    return count;
  }

  private boolean isEndDate() {
    return year == 2000 && month == 12 && day == 31;
  }

  private void incYear () {
    year++;
    month = 1;
    day = 1;
  }

  private void incMonth() {
    if (month == 12)
      incYear();
    else {
      month++;
      day = 1;
    }
  }

  private void incDay() {
    int type = (isLeapYear(year)) ? 1 : 0;
    if (day == LAST_DAY_OF_MONTH[type][month])
      incMonth();
    else
      day++;
  }

  private boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
}
