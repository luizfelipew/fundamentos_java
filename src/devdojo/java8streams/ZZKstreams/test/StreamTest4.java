package devdojo.java8streams.ZZKstreams.test;

import devdojo.java8streams.ZZKstreams.classes.Pessoa;

import java.util.Comparator;
import java.util.List;

public class StreamTest4 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

        System.out.println(pessoas.stream().anyMatch(
            p -> p.getSalario() > 4000));

        System.out.println(pessoas.stream().allMatch(
            p -> p.getIdade() > 18));

        System.out.println(pessoas.stream().noneMatch(
            p -> p.getIdade() < 18));

        findAnyStream(pessoas);

        findFirstStream(pessoas);
    }

    private static void findFirstStream(final List<Pessoa> pessoas) {
        pessoas.stream()
            .filter(p -> p.getIdade() > 30)
            .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
            .findFirst()
            .ifPresent(p -> System.out.println(p.getNome()));
    }

    private static void findAnyStream(final List<Pessoa> pessoas) {
        pessoas.stream()
            .filter(p -> p.getIdade() < 25)
            .findAny()
            .ifPresent(p -> System.out.println(p.getNome()));
    }

}
