public class App {
    public static void main(String[] args) throws Exception {
        boolean isCold = false; 
        int x = 2;
        int y = 3;

       // if ( !(x > 0 && y < 2) ) {
        if ( !(x > 0 || y < 2) ) {

       // if (isCold==true); { isCold = false 
            System.out.println("Wear a coat");
            System.out.println("Wear Gloves");
        }
        System.out.println("Bye");
    }
}
