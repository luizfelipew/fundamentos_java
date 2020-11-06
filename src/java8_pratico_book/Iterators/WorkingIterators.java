package java8_pratico_book.Iterators;

import java8_pratico_book.model.Usuario;
import java8_pratico_book.model.UsuarioToBuild;

import java.util.List;

public class WorkingIterators {

    public static void main(String[] args) {
        UsuarioToBuild usuarioToBuild = new UsuarioToBuild();
        List<Usuario> usuarios = usuarioToBuild.getUsuarios();

        usuarios.stream()
            .iterator().forEachRemaining(System.out::println);



    }

}
