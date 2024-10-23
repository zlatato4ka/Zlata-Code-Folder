// Name: Zlata Kapustyan
// Date: october 23, 2024
// Program Name: Geometry Calculator
// Program Description: This program calculates the perimeter of a rectangle, 
// surface area of a cube, and area of a circle based on user inputs.
import java.util.Scanner;

public class GeometryRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geometry geometry = new Geometry();  // Instantiate Geometry class

        System.out.println("Choose a calculation:");
        System.out.println("1. Perimeter of a Rectangle");
        System.out.println("2. Surface Area of a Cube");
        System.out.println("3. Area of a Circle");

        int choice = scanner.nextInt();  
        
        switch (choice) {
            case 1: //  rectangle
                System.out.print("Enter the length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width: ");
                double width = scanner.nextDouble();
                geometry.perimeter(length, width);
                break;
            case 2: //  cube
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                geometry.surfaceArea(side);
                break;
            case 3: //  circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                geometry.circleArea(radius);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        scanner.close(); 
    }
}