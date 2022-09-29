//Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not.
//The LeapYear program only works for year >= 1582, the Leap Year is a Year divisible by 4 and not 100 unless
// it is divisible by 400.

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        System.out.println("Enter the Year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year >= 1584) {
            if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
                System.out.println("It is a Leap Year");
            } else {
                System.out.println("It is not a leap Year");
            }
        } else {
            System.out.println("Please enter the valid year");
        }
    }
}
