//Zlata Kapustyan
//CFD written part
//22 Jan 2025
// you have to enter 3 numbers and after enter -1 
import java.util.Scanner;
public class BowlingScores {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int eliteCount = 0, totalCount = 0;

        System.out.println("Enter bowling scores (-1 to quit):");
        while(true){
            int score = scanner.nextInt();
            if (score == -1) break;
            if (score >= 0 && score <=300); {
                totalCount++;
                if (score >= 200) eliteCount++;
            }          

        }
        if (totalCount > 0) {
            double elitePercentage = (eliteCount * 100.0) / totalCount;
            double averagePercentage = 100 - elitePercentage;
            System.out.printf("Elite Bowlers; %.1f%%\n", elitePercentage);
            System.out.printf("Average Bowlers; %.1f%%\n", averagePercentage);
        } else{
            System.out.println("No scores entered.");
        }
        scanner.close();

    }
}
