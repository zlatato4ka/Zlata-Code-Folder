//Random Numbers Task
//Zlata Kapustyan
//November 13, 2024
// Design a program that generates two random integers, stores them into temporary variables, 
//and then compared the two to find the largest and the smallest.
//Once you complete that, add a for loop to make it happen 10 times or more. Feel free to use my random methods, Math.random(), or the random class methods.

public class CompareNumbers {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();

        for (int i = 0; i < 10; i++) {
            int[] numbers = rng.generateRandomNumbers();
            int num1 = numbers[0];
            int num2 = numbers[1];

            System.out.println("Here are two random numbers:");
            System.out.println(num1 + " and " + num2 + "\n");

            int smallest = Math.min(num1, num2);
            int largest = Math.max(num1, num2);

            System.out.println("The smallest is " + smallest);
            System.out.println("The biggest is " + largest + "\n");
        }
    }
}
