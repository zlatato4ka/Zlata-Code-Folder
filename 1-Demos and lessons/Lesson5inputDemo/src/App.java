//imports the scanner class into program
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

         System.out.print("Enter an integer: ");
         int num = keys.nextInt();
         System.out.println("Yout selected the number " + num);

        System.out.println("What is your name? ");
        String name = keys.nextLine();
        System.out.println("You entered: " + name);
        

    }
}
