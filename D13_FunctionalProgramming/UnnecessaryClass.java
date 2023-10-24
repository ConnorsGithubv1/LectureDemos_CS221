public class UnnecessaryClass implements MySampleInterface{

    @Override
    public int tryThat(int number) {
        return number % 2;
    }

    @Override
    public void tryThis() {
        String message = "im glad you tried this";
        System.out.println(message);
    }
    
}
