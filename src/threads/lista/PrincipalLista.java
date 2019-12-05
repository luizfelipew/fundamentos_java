package threads.lista;

public class PrincipalLista {

    public static void main(String[] args) throws InterruptedException {

        // implementacao do Arraylist para utilixzar threads
//        List<String> lista = Collections.synchronizedList(new ArrayList<>());
        // outro jeito que implementa lista sincronizada Vector (Thread-safe)
//        List<String> lista = new Vector<>();
        Lista lista = new Lista();

//        for (int i = 0; i < 10; i++) {
//            new Thread(new TarefaAdicionarElemento(lista, i)).start();
//        }

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();

        int numThreads = Runtime.getRuntime().availableProcessors();

//        Thread.sleep(2000);

//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(i + " - " + lista.get(i));
//        }

        System.out.println("Quantidade de nucleos utilizado é: " + numThreads);
    }

}
