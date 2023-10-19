import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int numerator, denominator, result;
        String[] names = {"Bilbo", "Frodo", "Samwise"};

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a numerator: ");
            numerator = scan.nextInt();

            System.out.println("Enter a denominator: ");
            denominator = scan.nextInt();

            result = numerator / denominator;

            System.out.println("The result is: " + result);
            
            displayTheName(names, result);
        } catch (InputMismatchException exception) {
            System.out.println("Clearly you don't want to use my program properly!");
        } catch (ArithmeticException exception) {
            System.out.println("Why are you dividing by zero?");
        } catch (Exception exception) {
            System.out.println("We caught it!");
        } finally {
            scan.close();
            System.out.println("Hope you run my application again :)");
        }
        
        
    }

    private static void displayTheName(String[] names, int index) {
        System.out.println("The name I choose is: " + names[index]);
    }
}