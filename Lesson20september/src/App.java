//Program name: Chiken wings
//Student name: Zlata Kapustyan
//Date: 20 September 2024
//Program Description: counting amount of chiken you can buy

public class App {
    public static void main(String[] args) throws Exception {
        double totalMoney = 4.75; // Total amount of money you have 
        double wingCost = 0.75; // Cost of one chicken wing 
         // Calculate the number of wings you can buy 
                int numberOfWings = (int) (totalMoney / wingCost); 
                // Output the result
                 System.out.println("You can buy " + numberOfWings + " chicken wings."); }
        
    
    
}
