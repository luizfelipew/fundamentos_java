package java8_pratico_book.functions;

import java8_pratico_book.model.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionTest {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);


//        Function<Usuario, String> extraiNome = u -> u.getNome();
//        Comparator<Usuario> comparator = Comparator.comparing(extraiNome);
//
//        usuarios.sort(comparator);
//
//        Function<Usuario, Integer> extraiPontos = u -> u.getPontos();
//        Comparator<Usuario> comparator = Comparator.comparing(extraiPontos);
//
//        usuarios.sort(comparator);

//        ToIntFunction<Usuario> extraiPontos = u -> u.getPontos();
//        Comparator<Usuario> comparator = Comparator.comparingInt(extraiPontos);

        usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));

    }

}
