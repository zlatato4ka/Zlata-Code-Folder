import java.util.Scanner;

public class ExpressionSolverRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a mathematical expression (e.g., 3 + 4 * 5): ");
        String input = scanner.nextLine();
        
        ExpressionSolver solver = new ExpressionSolver(input);
        solver.solveExpression();
        
        scanner.close();
    }
}
