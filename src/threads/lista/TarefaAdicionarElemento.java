package threads.lista;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    private int numeroDaThread;
    //    private List<String> lista;
    private Lista lista;

    //    public TarefaAdicionarElemento(List<String> lista, int numeroDaThread) {
    //        this.lista = lista;
    //        this.numeroDaThread = numeroDaThread;
    //    }

    public TarefaAdicionarElemento(Lista lista, int numeroDaThread) {
        this.lista = lista;
        this.numeroDaThread = numeroDaThread;
    }

    @Override
    public void run() {

        //        for (int i = 0; i < 100; i++){
        //            lista.add("Thread " + numeroDaThread + " - " + i);
        //        }

            for (int i = 0; i < 100; i++) {
                lista.adicionaElementos("Thread " + numeroDaThread + " - " + i);
            }
    }

}
