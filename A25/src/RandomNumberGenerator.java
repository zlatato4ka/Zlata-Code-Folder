import java.util.Random;

public class RandomNumberGenerator {
    private Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public int[] generateRandomNumbers() {
        int num1 = random.nextInt(2001) - 1000; 
        int num2 = random.nextInt(2001) - 1000; 
        return new int[]{num1, num2};
    }
}
