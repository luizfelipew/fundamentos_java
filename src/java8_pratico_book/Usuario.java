package java8_pratico_book;

public class Usuario {

    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(final String nome, final int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornaModerador(){
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }

}
