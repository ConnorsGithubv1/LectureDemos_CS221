import java.text.DecimalFormat;

public class InnerClass {
    private ReallyInnerClass divisionHelper;
    private int scaleFactor;

    public InnerClass(int scaleFactor) {
        this.scaleFactor = scaleFactor;
        this.divisionHelper = new ReallyInnerClass(scaleFactor * 1);
    }

    public String getFormattedCalculationResult(String repeatPattern, int dividend) {
        DecimalFormat format;
        String pattern = "";
        int result = this.divisionHelper.divide(dividend);

        for (int i = 0; i < this.scaleFactor; i++) {
            pattern += repeatPattern;
        }

        format = new DecimalFormat(pattern);
        return format.format(result);
    }
}
