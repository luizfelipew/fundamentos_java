package function;

import java.util.function.Function;

public class FunctionDesconto implements Function<Double, Double> {

    @Override
    public Double apply(final Double a) {
        return a / 2;
    }

}
