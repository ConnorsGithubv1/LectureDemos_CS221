public class RecursiveMethod {
    public static int sum(int number) {

        if (number == 1) { return 1;} // Base Case.. implemented as a guard
        
        return number + sum(number - 1);



        //Code to do the same thing(recursion)-->
        // int result;
        
        // if (number == 1) {
        //     result = 1;
        // } else {
        //     return number + sum(number - 1);
        // }
        // return result;
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
