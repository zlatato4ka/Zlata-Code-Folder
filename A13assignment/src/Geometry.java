import java.util.Scanner;

public class Geometry {

    // rectangle
    public void perimeter(double len, double wid) {
        double perimeter = 2 * (len + wid);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    //  cube
    public void surfaceArea(double side) {
        double surfaceArea = 6 * Math.pow(side, 2);
        System.out.println("The surface area of the cube is: " + surfaceArea);
    }

    //  circle
    public void circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
    }
}
