package java8_pratico_book.method_reference;

import java8_pratico_book.model.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceSecond {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        Usuario felipe = new Usuario("Felipe xablau", 50);
        Runnable bloco1 = felipe::tornaModerador;
        Runnable bloco2 = () -> felipe.tornaModerador();

        bloco1.run();
        bloco2.run();

        Usuario patricia = new Usuario("Patricia japa", 140);
        Consumer<Usuario> consumer = Usuario::tornaModerador;
        consumer.accept(patricia);

        usuarios.forEach(System.out::println);



    }
}
