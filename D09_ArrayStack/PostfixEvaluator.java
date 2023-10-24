import java.util.Scanner;
import java.util.Stack;

/**
 * This class will evaluate postfix (RPN) mathematical expressions
 * using integers and return the resulting integer. Standard mathematical operators
 * are supported. This class uses a stack to process the Operator enumeration.
 * @author lsevigny
 */
public class PostfixEvaluator {

    // private Stack<Integer> stack;
    private StackADT<Integer> stack;

    /**
     * The constructor which instantiates the PostfixEvaluator and
     * prepares the internal stack
     */
    public PostfixEvaluator() {
        // this.stack = new Stack<Integer>();
        this.stack = new ArrayStack<Integer>();
    }
    
    /**
     * This method parses the expression string and returns the integer result
     * @param expression The String containing the postfix expression with tokens separated by spaces. Integers and valid operator characters are assumed.
     * @return The resulting integer from evaluating the postfix expression
     */
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
