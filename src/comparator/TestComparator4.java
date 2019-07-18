package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator4 {
    public static void main(String[] args) {
        String[] vet = new String[]{"ordenado", "de", "forma", "diferente"};

        Arrays.sort(vet);
        for (String s : vet) System.out.println(s + " ");
        System.out.println(); // de diferente forma ordenado

        Arrays.sort(vet,
                (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        for (String s : vet) System.out.println(s + " ");
        System.out.println(); // de forma ordenado diferente
    }
}
