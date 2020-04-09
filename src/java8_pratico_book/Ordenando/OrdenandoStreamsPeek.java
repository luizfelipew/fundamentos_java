package java8_pratico_book.Ordenando;

import java8_pratico_book.model.Usuario;
import java8_pratico_book.model.UsuarioToBuild;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OrdenandoStreamsPeek {

    public static void main(String[] args) {
        UsuarioToBuild usuarioToBuild = new UsuarioToBuild();
        List<Usuario> usuarios = usuarioToBuild.getUsuarios();

        usuarios.stream()
            .sorted(Comparator.comparing(Usuario::getNome))
            .peek(System.out::println)
            .findAny();


    }

}
