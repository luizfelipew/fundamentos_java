package function;

import java.util.function.BiFunction;

public class BiFunctionSoma implements BiFunction<Double, Double, Double> {


    @Override
    public Double apply(final Double a, final Double b) {
        return a + b;
    }

}
