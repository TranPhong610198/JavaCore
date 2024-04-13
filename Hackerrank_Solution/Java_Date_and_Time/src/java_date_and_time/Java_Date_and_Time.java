// Print Day with Date given before
// 5th August 2015 is WEDNESDAY
package java_date_and_time;

import java.util.*;

public class Java_Date_and_Time {

    // check LeapYear
    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
    }

    // calculate Day of Month
    public static int dayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (checkLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }
    }

    // count LeapYear
    public static int countLeapYear(int startY, int endY) {
        int count = 0;
        for (int i = startY; i < endY; i++) {
            if (checkLeapYear(i)) {
                count++;
            }
        }
        return count;
    }

    // oder of date in year
    public static int oderOfDate(int day, int month, int year) {
        int result = day;
        for (int i = 1; i < month; i++) {
            result += dayOfMonth(i, year);
        }
        return result;
    }

    // calculate numbers of day from rootDay to inputDay
    public static int calDays(int day, int month, int year) {
        int result = 0;
        if (year > 2015) {
            result = (year - 2015 - countLeapYear(2015, year)) * 365 + countLeapYear(2015, year) * 366 + oderOfDate(day, month, year);
        }
        else{
            result = (2015 - year - countLeapYear(2015, year)) * 365 + countLeapYear(year, 2015) * 366 + oderOfDate(day, month, year);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Date Folow Type DD MM YY: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int temp = calDays(day, month, year)%7;
        if (year > 2015){
            if (month >8)
        }
    }
}
