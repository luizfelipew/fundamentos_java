package threads.lista;

public class TarefaAdicionarElemento implements Runnable {

    private int numeroDaThread;
    private Lista lista;

    public TarefaAdicionarElemento(Lista lista, int numeroDaThread) {
        this.lista = lista;
        this.numeroDaThread = numeroDaThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            lista.adicionaElementos("Thread " + numeroDaThread + " - " + i);
        }

    }

}
