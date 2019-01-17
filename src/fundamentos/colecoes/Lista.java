package fundamentos.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> aprovados = new ArrayList<>();
        aprovados.add("Jao");
        aprovados.add("Pedro");
        aprovados.add("Maria");
        aprovados.add("Rafa");

        System.out.println("Get .... ");
        System.out.println(aprovados.get(1));

        System.out.println("Add ....");
        System.out.println(aprovados.add("Maria"));
        System.out.println("Size..... " + aprovados.size());

        System.out.println("Removendo ....");
        System.out.println(aprovados.remove("maria"));
        System.out.println(aprovados.remove("Maria"));
        System.out.println("Size... " + aprovados.size());
        System.out.println("Imprimindo");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");


        aprovados.forEach(nome -> System.out.println(nome));
    }
}
