package java8streamsAPI.exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lista {
//    public static void main(String[] args) {
//        List<String> lista = Arrays.asList("Felipe", "Pati", "Gabi");
//
//        lista.stream()
//                .filter(s -> s.charAt(0) == 'P')
//                .forEach(System.out::println);
//    }

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("A", "AA", "AAA");
        Stream<Integer> st = lista.stream().map(String::length);
        st.forEach(System.out::println);

    }
}
