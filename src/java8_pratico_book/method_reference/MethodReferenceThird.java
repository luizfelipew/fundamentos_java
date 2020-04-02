package java8_pratico_book.method_reference;

import java8_pratico_book.model.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceThird {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);
        usuarios.forEach(System.out::println);



    }
}
