package java8_pratico_book.comparators;

import java8_pratico_book.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

//        Comparator<Usuario> comparator = new Comparator<Usuario>() {
//            @Override
//            public int compare(final Usuario u1, final Usuario u2) {
//                return u1.getNome().compareTo(u2.getNome());
//            }
//        };

        Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));


    }

}
