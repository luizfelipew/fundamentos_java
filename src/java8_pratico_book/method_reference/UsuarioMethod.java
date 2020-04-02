package java8_pratico_book.method_reference;

public class UsuarioMethod {

    private String nome;
    private int pontos;
    private boolean moderador;

    public UsuarioMethod(final String nome) {
        this.nome = nome;
    }

    public UsuarioMethod() {
    }


    public String getNome() {
        return nome;
    }

    public void tornaModerador(){
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }

    public String toString(){
        return "Usuario: " + nome;
    }

}
