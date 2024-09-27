// Program name: Assignment #8 Input Basics
// Student name: Zlata Kapustyan
// Date: 27 Sept 2024
// Program Description: Define, input, and print some variables and their values.

import java.util.Scanner;
public class App {
     public static void main (String[] args)
     {
        Scanner keyboard = new Scanner(System.in);
        int intOne, intTwo; 
        int double1, double2;

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);

        double1 = intOne * 2;
        double2 = intTwo * 2;

        System.out.println("integer one double= " + double1);
        System.out.println("integer two double= " + double2);

        int sum1, sum2; 
        sum1 = intOne  + intTwo;
        sum2 = double1  + double2;
        System.out.println("sum 1st= " + sum1);
        System.out.println("sum 2nd= " + sum2);


    }
}
