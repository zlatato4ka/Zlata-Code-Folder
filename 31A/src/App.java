import java.util.Arrays;

public class App {

    public static void main(String args[]) {
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        System.out.println(Arrays.toString(one));

        System.out.println("sum of spots 3-6  =  " + getSum(one, 3, 6));
        System.out.println("sum of spots 2-9  =  " + getSum(one, 2, 9));

        System.out.println("# of 4s  =  " + getCount(one, 4));
        System.out.println("# of 9s  =  " + getCount(one, 9));

        int[] newArrayOne = removeVal(one, 7);
        System.out.println("new array with all 7s removed = " + Arrays.toString(newArrayOne));
        System.out.println("# of 7s = " + (one.length - newArrayOne.length));

        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};

        System.out.println(Arrays.toString(two));

        System.out.println("sum of spots 3-16 = " + getSum(two, 3, 16));
        System.out.println("sum of spots 2-9  = " + getSum(two, 2, 9));
        System.out.println("# of 0s = " + getCount(two, 0));
        System.out.println("# of 3s = " + getCount(two, 3));
        System.out.println("# of 7s = " + getCount(two, 7));

        int[] newArrayTwo = removeVal(two, 7);
        System.out.println("new array with all 7s removed = " + Arrays.toString(newArrayTwo));
        System.out.println("# of 7s = " + (two.length - newArrayTwo.length));
    }

    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop && i < numArray.length; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for (int num : numArray) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }

    public static int[] removeVal(int[] numArray, int val) {
        int count = getCount(numArray, val);
        int[] newArray = new int[numArray.length - count];
        int index = 0;

        for (int num : numArray) {
            if (num != val) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }
}
