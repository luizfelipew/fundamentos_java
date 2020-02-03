package java8_pratico_book;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {

    @Override
    public void accept(final Usuario u) {
        System.out.println(u.getNome());
    }

}
