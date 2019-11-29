package threads.lista;

import java.util.List;
import java.util.Vector;

public class PrincipalLista {

    public static void main(String[] args) throws InterruptedException {

        // implementacao do Arraylist para utilixzar threads
//        List<String> lista = Collections.synchronizedList(new ArrayList<>());
        // outro jeito que implementa lista sincronizada Vector (Thread-safe)
        List<String> lista = new Vector<>();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        int numThreads = Runtime.getRuntime().availableProcessors();

        Thread.sleep(2000);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }

        System.out.println("Quantidade de nucleos utilizado é: " + numThreads);
    }

}
