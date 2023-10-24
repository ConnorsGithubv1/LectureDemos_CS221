import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        MainClass printer = new MainClass();
        int userInput;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer dividend to calculate: ");
        userInput = keyboard.nextInt();

        printer.doIt(userInput);
    }
}
