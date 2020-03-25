package java8_pratico_book.method_reference;

import java8_pratico_book.model.Usuario;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TornaModerador implements Consumer<List<Usuario>> {

    @Override
    public void accept(final List<Usuario> usuarios) {
        usuarios.forEach(Usuario::tornaModerador);
        usuarios.sort(Comparator.comparing(Usuario::getNome));
    }

}
