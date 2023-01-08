package arithmatics;
import java.util.function.BiFunction;

public class QuadEquation implements BiFunction<Double, Double, Double> {
    @Override
    public Double apply(Double num1, Double num2) {

        return num1 / num2;
    }

    public Double[] apply(Integer num1, Integer num2, Integer num3) {
        double d = Math.pow(num2, 2.0) - 4.0 * num1 * num3;
        if (d > 0.0) {
            Double[] Roots = new Double[2];
            Roots[0] = apply((-num2 + Math.pow(d, 0.5)), (2.0 * num1));
            Roots[1] = apply((-num2 - Math.pow(d, 0.5)), (2.0 * num1));
            return Roots;
        } else if (d == 0.0) {
            Double[] Roots = new Double[1];
            Roots[0] = apply((-num2.doubleValue()), (2.0 * num1));
            return Roots;
        }
        return null;
    }
}
