package fundamentos.colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
//        Set<String> aprovados = new HashSet<>();

        // respeitando a ordem de inserção usando LinkedHashSet
//        Set<String> aprovados = new LinkedHashSet<>();

        // treeset ordena dependendo do tipo de set se for string pela ordem alfabetica se for numero por ordem numerica  etc
        Set<String> aprovados = new TreeSet<>();


        aprovados.add("João");
        aprovados.add("Pedro");
        aprovados.add("Maria");
        aprovados.add("Rafael");

        for (String nome: aprovados){
            System.out.println(nome);
        }

//        aprovados.forEach(nome -> System.out.println(nome));



    }
}
