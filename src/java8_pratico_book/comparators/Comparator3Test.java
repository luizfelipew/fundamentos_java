package java8_pratico_book.comparators;

import java8_pratico_book.model.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator3Test {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);


        List<Usuario> usuariosSecond = new ArrayList<>();
        usuariosSecond.add(usuario1);
        usuariosSecond.add(usuario2);
        usuariosSecond.add(usuario3);

        usuarios.sort(Comparator.comparingInt(Usuario::getPontos));

        List<String> collect = usuarios.stream()
            .map(Usuario::getNome)
            .collect(Collectors.toList());

        System.out.println(collect.get(0));
        System.out.println("=====================\n");
        System.out.println("=====================");

        usuariosSecond.sort(Comparator.comparingInt(Usuario::getPontos)
                                .thenComparing(Usuario::getNome));

        List<String> collectSecond = usuariosSecond.stream()
            .map(Usuario::getNome)
            .collect(Collectors.toList());

        System.out.println(collectSecond.get(1));
    }

}
