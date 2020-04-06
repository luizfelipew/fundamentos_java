package java8_pratico_book.optional;

import java8_pratico_book.model.Usuario;
import java8_pratico_book.model.UsuarioToBuild;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalCalculos {

    public static void main(String[] args) {
        UsuarioToBuild usuarioToBuild = new UsuarioToBuild();

        List<Usuario> usuarios = usuarioToBuild.getUsuarios();

//        double media = usuarios.stream()
//            .mapToInt(Usuario::getPontos)
//            .average()
//            .orElse(0.0);

//        double media = usuarios.stream()
//            .mapToInt(Usuario::getPontos)
//            .average()
//            .orElseThrow(IllegalStateException::new);
//

        Optional<String> maxNome = usuarios.stream()
            .max(Comparator.comparing(Usuario::getPontos))
            .map(Usuario::getNome);

        System.out.println(maxNome);
    }


}
