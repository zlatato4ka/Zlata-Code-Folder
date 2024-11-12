//Loop Stats 
//Zlata Kapustyan
//November 12, 2024
//  Run a loop from a provided start number to a provided stop number.   
// Total up all numbers in the group, determine all odds in the group, and determine all evens in the group.


import static java.lang.System.*;

public class LoopStatsRunner {
    public static void main(String[] args) {
        LoopStats stats = new LoopStats(1, 10);

        out.println(stats.toString());

        // the total
        out.println("Total: " + stats.getTotal());

        // even count
        out.println("Even Count: " + stats.getEvenCount());

        // odd count
        out.println("Odd Count: " + stats.getOddCount());

        //test cases
        LoopStats anotherStats = new LoopStats();
        anotherStats.setNums(5, 15);
        out.println(anotherStats.toString());
        out.println("Total: " + anotherStats.getTotal());
        out.println("Even Count: " + anotherStats.getEvenCount());
        out.println("Odd Count: " + anotherStats.getOddCount());
    }
}
