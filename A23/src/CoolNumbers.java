import static java.lang.System.*;

public class CoolNumbers {
    public static boolean isCoolNumber(int num) {
        return (num % 3 == 1) && (num % 4 == 1) && (num % 5 == 1) && (num % 6 == 1);
    }

    public static int countCoolNumbers(int stop) {
        int count = 0;
        for (int i = 7; i <= stop; i++) { // start at 7 since we want numbers between 6 and stop
            if (isCoolNumber(i)) {
                count++;
            }
        }
        return count;
    }
}