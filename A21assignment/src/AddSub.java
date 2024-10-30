import static java.lang.System.*;

public class AddSub {

    public static double check(int a, int b) {
        if (a > b) {
            return a - b;
        } else if (b > a) {
            return b - a;
        } else { // a == b
            return a + b;
        }
    }
}
