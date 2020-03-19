package java8_pratico_book.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator2Test {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Casa do codigo", "Alura", "Caelum");

        palavras.sort(Comparator.naturalOrder());
        System.out.println(palavras);

    }

}
