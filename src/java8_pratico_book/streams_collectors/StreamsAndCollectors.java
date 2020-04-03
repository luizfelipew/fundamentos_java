package java8_pratico_book.streams_collectors;

import java8_pratico_book.model.Usuario;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAndCollectors {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);
        Usuario usuario4 = new Usuario("Campos", 195);
        Usuario usuario5 = new Usuario("Caca Campos", 200);
        Usuario usuario6 = new Usuario("Luiz Tranqueira", 10);
        Usuario usuario7 = new Usuario("Teste Vulgar", 19);
        Usuario usuario8 = new Usuario("Xablau Master", 1000);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8);

//        usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
//
//        usuarios
//            .subList(0, 8)
//            .forEach(Usuario::tornaModerador);

//         usuarios.stream()
//             .filter(u -> u.getPontos() > 100)
//             .forEach(System.out::println);

        usuarios.stream()
            .filter(Usuario::isModerador);

    }

}
