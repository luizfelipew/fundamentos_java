package function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> soma = (a, b) -> a + b;

        Function<Double, Double> desconto = (a) -> a * 0.10;

        System.out.println(soma.andThen(desconto).apply(10D, 5D));

        BiFunctionSoma biFunctionSoma = new BiFunctionSoma();
        FunctionDesconto functionDesconto = new FunctionDesconto();

        Double resultDouble = biFunctionSoma.andThen(functionDesconto::apply).apply(15D, 10D);
        System.out.println(resultDouble);


    }
}
