import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.analysis.function.Sqrt;


public class MathOperations {
    public static double calculateSquareRoot(double x) {
        return new Sqrt().value(x);
    }

}
