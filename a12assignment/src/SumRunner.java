public class SumRunner {
    public static void main(String[] args) throws Exception {
        // Create an instance of the Sum class
        Sum sumInstance = new Sum();
        
        // Test Case 1
        sumInstance.setNums(5, 10);
        sumInstance.print();
        
        // Test Case 2
        sumInstance.setNums(20, 30);
        sumInstance.print();
        
        // Test Case 3
        sumInstance.setNums(-1, 1);
        sumInstance.print();
        
        // Test Case 4
        sumInstance.setNums(0, 0);
        sumInstance.print();
        
        // Test Case 5
        sumInstance.setNums(15, 25);
        sumInstance.print();
        
        // Additional Test Case 6
        sumInstance.setNums(-10, 10);
        sumInstance.print();
        
        // Additional Test Case 7
        sumInstance.setNums(100, 200);
        sumInstance.print();
        
        // Additional Test Case 8
        sumInstance.setNums(50, -25);
        sumInstance.print();
    }
}

