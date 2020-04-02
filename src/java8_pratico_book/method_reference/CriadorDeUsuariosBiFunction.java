package java8_pratico_book.method_reference;

import java8_pratico_book.model.Usuario;

import java.util.function.BiFunction;

public class CriadorDeUsuariosBiFunction implements BiFunction<String, Integer, Usuario> {

    @Override
    public Usuario apply(final String nome, final Integer pontos) {
        return new Usuario(nome, pontos);
    }

}
