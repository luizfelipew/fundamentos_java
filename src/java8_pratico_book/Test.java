package java8_pratico_book;

import java8_pratico_book.model.Usuario;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));

        usuarios.forEach(usuario -> usuario.tornaModerador());

        usuarios.forEach(usuario -> System.out.println(usuario.isModerador()));
        //        Runnable r = () -> {
        //            for (int i = 0; i <= 1000; i++){
        //                System.out.println(i);
        //            }
        //        };

        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                System.out.println(i);
            }
        }).start();
    }

}
