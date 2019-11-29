package threads.lista;

public class PrincipalLista {

    public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        int numThreads = Runtime.getRuntime().availableProcessors();

        Thread.sleep(2000);

        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.pegaElemento(i));
        }

        System.out.println("Quantidade de nucleos utilizado é: " + numThreads);
    }

}
