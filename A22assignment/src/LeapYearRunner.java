// Program name: Leap Year
// Name: Zlata
// Date: 30 October
//Project Description: Write a program to determine if a year is a leap year.  A leap year is any year evenly divisible by 4 or 400.  You will need to use mod %.

import static java.lang.System.*;
import java.util.Scanner;

public class LeapYearRunner {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Prompt user for the year
        out.print("Enter a year: ");
        int year = keyboard.nextInt();

        // Check and display if it's a leap year
        if (LeapYear.isLeapYear(year)) {
            out.println(year + " is a leap year.");
        } else {
            out.println(year + " is NOT a leap year.");
        }

        keyboard.close();
    }
}
