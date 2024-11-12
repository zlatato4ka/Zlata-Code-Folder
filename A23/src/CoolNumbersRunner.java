// CoolNumbers
// Zlata Kapustyan
// November 12, 2024
// Complete methods isCoolNum( n ) && countCoolNumbers( n ).  
// isCoolNum( n) will determine if a number is a cool number.  
// A cool number is any number that has a remainder of 1 when divided by 3,4,5, and 6.  countCoolNumbers will count the number
// of cool numbers between 6 and the parameter passed in.

import static java.lang.System.*;

public class CoolNumbersRunner {

    public static void main(String[] args) {
        System.out.println(CoolNumbers.countCoolNumbers(250) + " cool numbers between 6 - " + 250);
        System.out.println(CoolNumbers.countCoolNumbers(1250) + " cool numbers between 6 - " + 1250);
        System.out.println(CoolNumbers.countCoolNumbers(2250) + " cool numbers between 6 - " + 2250);
        System.out.println(CoolNumbers.countCoolNumbers(5500) + " cool numbers between 6 - " + 5500);
        System.out.println(CoolNumbers.countCoolNumbers(9500) + " cool numbers between 6 - " + 9500);
        System.out.println(CoolNumbers.countCoolNumbers(23500) + " cool numbers between 6 - " + 23500);
        System.out.println(CoolNumbers.countCoolNumbers(32500) + " cool numbers between 6 - " + 32500);
    }
}    