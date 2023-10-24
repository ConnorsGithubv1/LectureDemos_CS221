import java.util.InputMismatchException;

/**
 * This enumeration defines the valid mathematical operators
 * that can be used
 * Valid Values: add, subtract, multiply, divide
 * @author lsevigny
 */
public enum Operator {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');

    private char symbol;

    private Operator(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter to return the appropriate operator symbol: +, -, *, /
     * @return The character associated with the operator value
     */
    public char getSymbol() {
        return this.symbol;
    }

    /**
     * Method to calculate the mathematical operation of the given binary operator
     * given the left and right hand operands (note: these are assumed to be integers)
     * @param leftOperand the left hand operand of the binary operator
     * @param rightOperand the right hand operand of the binary operator
     * @return the result of the mathematical operation
     */
    public int evaluate(int leftOperand, int rightOperand) {
        switch (this) {
            case ADD:
                return leftOperand + rightOperand;
            case SUBTRACT:
                return leftOperand - rightOperand;
            case MULTIPLY:
                return leftOperand * rightOperand;
            case DIVIDE:
                return leftOperand / rightOperand;
            default:
                throw new ArithmeticException("Operator could not be resolved.");
        }

    }

    /**
     * Method to determine if the String token is a valid operator
     * @param token string to be checked
     * @return whether or not the token is an operator
     */
    public static boolean isOperator(String token) {
        if (token.length() != 1) { return false; } // Guard a statement
        return isOperator(token.charAt(0));
    }

    /**
     * Method to determine if the character token is a valid operator
     * @param token character to be checked
     * @return whether or not the token is an operator
     */
    public static boolean isOperator(char token) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol() == token) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method attempts to map a string symbol to a valid operator. If none is discovered
     * or the string is invalid, an InputMismatchException is thrown.
     * @param symbol the string representing a potential operator
     * @return the valid operator value from the given symbol
     */
    public static Operator fromString(String symbol) {
        symbol = symbol.trim();
        if (symbol.length() != 1) { throw new InputMismatchException("Invalid operator symbol: " + symbol); } // Guard a statement
        return fromCharacter(symbol.charAt(0));
    }

    /**
     * This method attempts to map a character symbol to a valid operator. If none is discovered
     * or the character is invalid, an InputMismatchException is thrown.
     * @param symbol the character representing a potential operator
     * @return the valid operator value from the given symbol
     */
    public static Operator fromCharacter(char symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol() == symbol) {
                return operator;
            }
        }
        throw new InputMismatchException("Invalid operator symbol: " + symbol);
    }

    /**
     * The overridden toString() method
     * @return The String representation of the operator
     */
    public String toString() {
        return this.symbol + "";
    }
}
