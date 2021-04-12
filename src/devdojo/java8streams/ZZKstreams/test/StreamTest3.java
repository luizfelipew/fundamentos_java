package devdojo.java8streams.ZZKstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest3 {
    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("Devdojo", "Valeu por aumentar a letra"));
        nomes.add(asList("Luiz", "demorou muito pra isso"));
        List<String> collect = nomes
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(collect);

        List<String> palavras = asList("Ola", "Goku");
        String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));
        List<String[]> collect1 = palavras
                .stream()
                .map(p -> p.split(""))
                .collect(Collectors.toList());
        Stream<String> stream = Arrays.stream((String[]) palavras.toArray());
        System.out.println(stream);

        List<String> collect2 = palavras
                .stream()
                .map(p -> p.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(collect2);

    }
}
