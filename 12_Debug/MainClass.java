public class MainClass {
    private InnerClass calculator;
    private String character;

    public MainClass() {
        this(1, "");
    }

    public MainClass(int factor, String character) {
        this.character = character;
        this.calculator = new InnerClass(factor);
    }

    public void doIt(int dividend) {
        System.out.println(this.calculator.getFormattedCalculationResult(character, dividend));
    }
}
