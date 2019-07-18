package comparator;

import java.util.Arrays;

public class TestComparator {
    public static void main(String[] args) {
        String[] vet = new String[]{"ordenado", "de", "forma", "diferente"};

        Arrays.sort(vet);
        for (String s : vet) System.out.println(s + " ");
        System.out.println(); // de diferente forma ordenado

        Arrays.sort(vet, new ComparadorTamanho());
        for (String s : vet) System.out.println(s + " ");
        System.out.println(); // de forma ordenado diferente
    }
}
