package java8_pratico_book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test4 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        Predicate<Usuario> predicado = new Predicate<Usuario>() {
            @Override
            public boolean test(final Usuario usuario) {
                return usuario.getPontos() > 160;
            }
        };

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        usuarios.removeIf(predicado);
        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
    }

}
