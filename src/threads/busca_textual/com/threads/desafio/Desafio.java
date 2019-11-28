package threads.busca_textual.com.threads.desafio;

public class Desafio {

    public static void main(String[] args) {
        new Thread(new TarefaImprimeNumeros()).start();
        new Thread(new TarefaImprimeNumeros()).start();
    }

}
