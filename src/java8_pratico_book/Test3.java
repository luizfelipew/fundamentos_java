package java8_pratico_book;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test3 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        Consumer<Usuario> mostraMenagem = usuario -> System.out.println("Antes de imprimir os nomes");

        Consumer<Usuario> imprimeNome = usuario -> System.out.println(usuario.getNome());

        usuarios.forEach(mostraMenagem.andThen(imprimeNome));
    }

}
