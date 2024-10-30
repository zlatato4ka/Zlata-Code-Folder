// Program name: Miles per Hour
// Student name: Zlata Kapustyan
// Date: 25 October
// Program Description: Given a distance traveled (miles) and elapsed time (hours and minutes), calculate the speed in miles per hour.  
// distance = rate * time  minutes / 60 = hours  ( 360 / 60 == 6 hours )

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);

        out.print("Enter the distance :: ");
        int dist = keyboard.nextInt();

        out.print("Enter the hours :: ");
        int hrs = keyboard.nextInt();

        out.print("Enter the minutes :: ");
        int mins = keyboard.nextInt();

        MilesPerHour test = new MilesPerHour(dist, hrs, mins);
        test.print(); 

        keyboard.close();
    }
}