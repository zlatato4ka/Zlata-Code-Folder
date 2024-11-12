import static java.lang.System.*;

public class LoopStats {
    private int start, stop;

    public LoopStats() {
        this.start = 0;
        this.stop = 0;
    }

    public LoopStats(int beg, int end) {
        this.start = beg;
        this.stop = end;
    }

    public void setNums(int beg, int end) {
        this.start = beg;
        this.stop = end;
    }

    //  evens between start and stop
    public int getEvenCount() {
        int evenCount = 0;

        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    // odds between start and stop
    public int getOddCount() {
        int oddCount = 0;

        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    // total of numbers between start and stop
    public int getTotal() {
        int total = 0;

        for (int i = start; i <= stop; i++) {
            total += i;
        }
        return total;
    }

    public String toString() {
        return "Start: " + start + ", Stop: " + stop;
    }
}

