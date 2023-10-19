import java.util.Scanner;

public class AnalyzeMe {
    private static long statementCount;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        statementCount++; // the Scanner declaration, instantiation, and assignment
        System.out.println("Enter sample size...");
        statementCount++; // the previous println
        int n = keyboard.nextInt();
        statementCount++; // previous read and assignment
        System.out.println("Sample Size: " + n);
        statementCount++; // the previous println


        statementCount += 2; // declare and assign i and first i < n comparison
        for (int i = 0; i < n; i++) {
            statementCount += 2; // declare and assign j and first j < n comparison
            for (int j = 0; j < n; j++) {
                System.out.println("Processing...");
                statementCount++; // the previous println
                statementCount++; // j increment
                statementCount++; // j < n comparison
            }
            statementCount++; // i increment
            statementCount++; // i < n comparison
        }

        keyboard.close();
        statementCount++; // close the Scanner
    }

    public static long getStatementCount() {
        return statementCount;
    }
}