package java8_pratico_book.model;


import java.util.Arrays;
import java.util.List;

public class UsuarioToBuild {

    private Usuario usuario1 = new Usuario("Luiz Felipe", 150);
    private Usuario usuario2 = new Usuario("Pati Maionese", 120);
    private Usuario usuario3 = new Usuario("Felipe Wendt", 190);
    private Usuario usuario4 = new Usuario("Campos", 195);
    private Usuario usuario5 = new Usuario("Caca Campos", 200);
    private Usuario usuario6 = new Usuario("Luiz Tranqueira", 10);
    private Usuario usuario7 = new Usuario("Teste Vulgar", 19);
    private Usuario usuario8 = new Usuario("Xablau Master", 1000);


    public List<Usuario> getUsuarios() {
        return Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8);
    }

}
