package devdojo.java8streams.ZZKstreams.test;

import devdojo.java8streams.ZZKstreams.classes.Pessoa;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest5Reduce {

    public static void main(String[] args) {
        reduce();
        soma();
        soma2();
        multiply();
        max();
        max2();
        min();


        final Optional<Double> somaSalario = Pessoa.bancoDePessoas().stream()
            .filter(p -> p.getSalario() > 4000)
            .map(Pessoa::getSalario)
            .reduce(Double::sum);
        System.out.println(somaSalario.get());

        
        final Double somaDouble = Pessoa.bancoDePessoas().stream()
            .filter(p -> p.getSalario() > 4000)
            .mapToDouble(Pessoa::getSalario)
            .sum();
        System.out.println(somaDouble);

        final DoubleStream doubleStream = Pessoa.bancoDePessoas().stream()
            .filter(p -> p.getSalario() > 4000).mapToDouble(Pessoa::getSalario);
        final Stream<Double> doubleStream2 = doubleStream.boxed();
    }

    private static void min() {
        final Optional<Integer> min = getStream().reduce(Integer::min);
        System.out.println(min.get());
    }

    private static void max2() {
        final Optional<Integer> max2 = getStream().reduce(Integer::max);
        System.out.println(max2.get());
    }

    private static void max() {
        final Optional<Integer> max = getStream().reduce((x, y) -> x > y ? x : y);
        System.out.println(max.get());
    }

    private static void multiply() {
        Integer mult = getStream().reduce(1, (x, y) -> x * y);
        System.out.println(mult);
    }

    private static void soma2() {
        final Optional<Integer> soma2 = getStream().reduce(Integer::sum);
        System.out.println("Com optional usando o sum do (Integer): " + soma2.get());
    }

    private static void soma() {
        final Integer soma = getStream().reduce(0, (x, y) -> x + y);
        System.out.println("Sem optional: " + soma);
    }

    private static void reduce() {
        final Optional<Integer> reduce = getStream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());
    }

    private static Stream<Integer> getStream() {
        return asList(1, 2, 3, 4, 5, 6).stream();
    }

}
