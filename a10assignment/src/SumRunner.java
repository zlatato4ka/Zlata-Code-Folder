// Program name: SumRunner
// Student name: Zlata Kapustyan
// Date: 15 September 2024
//Program Description:Given two numbers, calculate the sum and print the sum. sum = one + two sum is equal to the value of one added to the value of two

//             In this assignment I would like you to use Sum.java to create a method that you will pass parameters to the program SumRunner.java. 
            
//             You will write the code for the methods: setNums, Sum, and Print in Sum.java and instantiate the same methods in SumRunner.java. 
            
//             When you run SumRunner.java your program will add two numbers together. 
            
//             Please submit both Sum and SumRunner with additional test cases.

 



import java.util.Scanner;

public class SumRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sum sumCalculator = new Sum();

        System.out.print("Enter the first number (one): ");
        int one = scanner.nextInt();

        System.out.print("Enter the second number (two): ");
        int two = scanner.nextInt();

        sumCalculator.setNums(one, two);
        sumCalculator.printSum();

        scanner.close();
    }
}