// Program Name: AddSubRunner
// Student Name: Zlata Kapustyan
// Date: 25 October
// Program Description: This is the runner class for the AddSub program, 
// which tests various pairs of integers.

import static java.lang.System.*;

public class AddSubRunner {

    public static void main(String args[]) {
        System.out.println(AddSub.check(10, 20));        
        System.out.println(AddSub.check(20, 10));    
        System.out.println(AddSub.check(20, 20));
        System.out.println(AddSub.check(10, 10));    
        System.out.println(AddSub.check(0, 1));   
        System.out.println(AddSub.check(1, 0));
        System.out.println(AddSub.check(3, 5));   
        System.out.println(AddSub.check(5, 3));
        System.out.println(AddSub.check(5342, 323));                    
    }
}
