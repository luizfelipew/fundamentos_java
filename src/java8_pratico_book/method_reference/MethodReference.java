package java8_pratico_book.method_reference;

import java8_pratico_book.model.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luiz Felipe", 150);
        Usuario usuario2 = new Usuario("Pati Maionese", 120);
        Usuario usuario3 = new Usuario("Felipe Wendt", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        Consumer<Usuario> tornaModerador = Usuario::tornaModerador;
        usuarios.forEach(tornaModerador);
        usuarios.sort(Comparator.comparing(Usuario::getNome));

        TornaModerador tornaModeradorTest = new TornaModerador();

        tornaModeradorTest.accept(usuarios);

        Function<Usuario, String> byName = Usuario::getNome;
        usuarios.sort(Comparator.comparing(byName));

        FunctionModerador functionModerador = new FunctionModerador();
        usuarios.sort(Comparator.comparing(functionModerador::apply));


//        Runnable runnable = () -> usuarios.forEach(functionModerador::apply);
//        runnable.run();

    }
}
