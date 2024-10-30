import static java.lang.System.*;
import static java.lang.Math.*;
public class MilesPerHour {
    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0, 0, 0);
        mph = 0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        setNums(dist, hrs, mins);
        calcMPH();
    }

    public void setNums(int dist, int hrs, int mins) {
        this.distance = dist;
        this.hours = hrs;
        this.minutes = mins;
    }

    public void calcMPH() {
        double totalHours = hours + minutes / 60.0;
        if (totalHours != 0) {
            mph = distance / totalHours;
        } else {
            mph = 0; 
        }
    }

    public void print() {
        out.printf("%d miles in %d hour(s) and %d minute(s) = %.2f MPH.%n",
                   distance, hours, minutes, mph);
    }
}