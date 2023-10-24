import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    private Stack<Integer> stack;

    public PostfixEvaluator() {
        this.stack = new Stack<Integer>();
    }
    
    public int evaluate(String expression) {
        Scanner parser = new Scanner(expression);
        String token;
        int leftOperand, rightOperand, result = 0;

        while (parser.hasNext()) {
            token = parser.next();
            // If the token is an operator
            if (Operator.isOperator(token)) { // Then...
                // Pop the first two items off of the stack
                rightOperand = stack.pop();
                leftOperand = stack.pop();
                // Evaluate the operation
                result = Operator.fromString(token).evaluate(leftOperand, rightOperand);
                // Push the result onto the stack
                stack.push(result);
            } else { // Otherwise...
                // Parse the String token into an int
                // Push the int onto the stack
                stack.push(Integer.parseInt(token));
            }
        }

        parser.close();
        // The final result... last item on the stack
        return result;
    }
}
