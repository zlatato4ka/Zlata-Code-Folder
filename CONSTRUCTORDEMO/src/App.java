public class App {
    public static void main(String[] args) throws Exception {
        SUBMETHODS test = new SUBMETHODS();


        int num = test.myFunction();
        System.out.println("The return is" + num);

        myName();
    }

    private static void myName() {
        System.out.println("My name Zlata");

    }
}
