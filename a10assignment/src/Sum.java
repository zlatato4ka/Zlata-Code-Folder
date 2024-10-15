public class Sum {
    private int one;
    private int two;

    // Method to set the two numbers
    public void setNums(int one, int two) {
        this.one = one;
        this.two = two;
    }

    // Method to calculate the sum
    public int getSum() {
        return one + two;
    }

    // Method to print the sum
    public void printSum() {
        System.out.println("The sum of " + one + " and " + two + " is: " + getSum());
    }
}