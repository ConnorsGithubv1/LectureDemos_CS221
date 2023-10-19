import java.util.Scanner;

public class PostfixTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PostfixEvaluator evaluator = new PostfixEvaluator();
        String expression;
        int result;

        System.out.println("Enter a valid post-fix expression one token at a time with a space between each token.");
        expression = keyboard.nextLine();

        result = evaluator.evaluate(expression);
        System.out.println("\nThat expression equals " + result);

        keyboard.close();

    }
}