package consumer;

import java.util.function.BiConsumer;

public class TestConsumer  {
    public static void main(String[] args) {
        BiConsumer<Double, Double> total = (a, b) -> System.out.println(a + b);

        BiConsumer<Double, Double> desconto = (a, b) -> System.out.println((a + b) * 0.1);

        total.andThen(desconto).accept(10D , 5D);
    }
}
