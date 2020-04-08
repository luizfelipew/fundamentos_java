package java8_pratico_book.Ordenando;

import java8_pratico_book.model.Usuario;
import java8_pratico_book.model.UsuarioToBuild;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class OrdenandoStreams {

    public static void main(String[] args) {
        UsuarioToBuild usuarioToBuild = new UsuarioToBuild();

        List<Usuario> usuarios = usuarioToBuild.getUsuarios();

        List<Usuario> filtradosOrdenados = usuarios.stream()
            .filter(usuario -> usuario.getPontos() > 100)
            .sorted(Comparator.comparing(Usuario::getNome))
            .collect(toList());

        System.out.println(filtradosOrdenados);
    }

}
