package java8_pratico_book.Ordenando;

import java8_pratico_book.model.Usuario;
import java8_pratico_book.model.UsuarioToBuild;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

public class OrdenandoStreamsLazy {

    public static void main(String[] args) {
        UsuarioToBuild usuarioToBuild = new UsuarioToBuild();
        List<Usuario> usuarios = usuarioToBuild.getUsuarios();

        Optional<Usuario> usuarioOptional = usuarios.stream()
            .filter(usuario -> usuario.getPontos() > 100)
            .findAny();

        System.out.println(usuarioOptional);
    }

}
