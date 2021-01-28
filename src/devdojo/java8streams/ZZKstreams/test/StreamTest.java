package devdojo.java8streams.ZZKstreams.test;

import devdojo.java8streams.ZZKstreams.classes.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        Collections.sort(pessoas, (c1,c2) -> c1.getNome().compareTo(c2.getNome()));
        List<String> nomes = new ArrayList<>();

        for (Pessoa pessoa: pessoas) {
            if (pessoa.getIdade() > 25) {
                nomes.add(pessoa.getNome());
                if (nomes.size() >= 3){
                    break;
                }
            }
        }

        System.out.println(nomes);
        List<String> nomes2 = pessoas
                .stream()
                .filter(p -> p.getIdade() < 25)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .limit(3)
                .skip(1)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        System.out.println("=======================");
        System.out.println(nomes2);


        long countPessoas = pessoas
                .stream()
                .distinct()
                .filter(p -> p.getIdade() < 25)
                .map(Pessoa::getNome)
                .count();
        System.out.println("=======================");
        System.out.println(countPessoas);
        pessoas.stream().forEach(System.out::println);
    }
}
