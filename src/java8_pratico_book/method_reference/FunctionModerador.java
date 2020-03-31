package java8_pratico_book.method_reference;

import java8_pratico_book.model.Usuario;

import java.util.function.Function;

public class FunctionModerador implements Function<Usuario, String> {


    public String apply(final Usuario usuario) {
        return usuario.getNome();
    }

}
