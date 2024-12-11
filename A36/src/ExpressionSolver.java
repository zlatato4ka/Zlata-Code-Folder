import java.util.ArrayList;

public class ExpressionSolver {
    private String expression;

    // Constructor
    public ExpressionSolver(String s) {
        expression = s;
    }

    // Set the expression
    public void setExpression(String s) {
        expression = s;
    }

    // Solve the expression
    public void solveExpression() {
        ArrayList<String> tokens = new ArrayList<>();

        // Split the expression into tokens
        for (String part : expression.split(" ")) {
            tokens.add(part);
        }

        // First, handle multiplication and division
        processOperators(tokens, "*", "/");

        // Then, handle addition and subtraction
        processOperators(tokens, "+", "-");

        // The final result is the only element left in the tokens
        System.out.println(expression + " = " + tokens.get(0));
    }

    private void processOperators(ArrayList<String> tokens, String op1, String op2) {
        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);

            // Check for operators
            if (token.equals(op1) || token.equals(op2)) {
                int firstOperand = Integer.parseInt(tokens.get(i - 1));
                int secondOperand = Integer.parseInt(tokens.get(i + 1));
                int result = 0;

                // Process the operator
                if (token.equals(op1)) {
                    result = firstOperand * secondOperand;
                } else if (token.equals(op2)) {
                    result = firstOperand + secondOperand; // For +
                    result = firstOperand - secondOperand; // For -
                }

                // Update the tokens ArrayList
                tokens.set(i - 1, String.valueOf(result));
                tokens.remove(i); // Remove operator
                tokens.remove(i); // Remove the second operand
                i--; // Move index back to process correctly
                // Reset the loop to iterate correctly after changes
                i = -1; // Start again to check from the beginning
            }
        }
    }

    @Override
    public String toString() {
        return expression;
    }
}
