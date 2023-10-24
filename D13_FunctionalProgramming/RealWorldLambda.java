import java.util.Arrays;
public class RealWorldLambda {
    
    public static void main(String[] args) {
        Integer[] grades = { 16, 3, 1000, 42, 666, 23, 1 , 13, 63};

        Arrays.sort(grades, (numberOne, numberTwo) -> numberOne.compareTo(numberTwo));                                                                               

        for (int number : grades) {
            System.out.println(number);
        }
    }
}
