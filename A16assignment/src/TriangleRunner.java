// Name: Zlata Kapustyan
// Date: october 24, 2024
// Program Name:  Area of a Triangle
// Program Description: Calculate the area of a triangle given the values for all three sides.

import java.util.Scanner;

public class TriangleRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter side A :: ");
        int a = keyboard.nextInt();
        System.out.print("Enter side B :: ");
        int b = keyboard.nextInt();
        System.out.print("Enter side C :: ");
        int c = keyboard.nextInt();

        Triangle test = new Triangle(a, b, c);
        test.print();

        System.out.print("Enter side A :: ");
        a = keyboard.nextInt();
        System.out.print("Enter side B :: ");
        b = keyboard.nextInt();
        System.out.print("Enter side C :: ");
        c = keyboard.nextInt();

        test.setSides(a, b, c);
        test.calcPerimeter();
        test.calcArea();
        test.print();
    }
}
