package threads.busca_textual.com.threads;

public class PrincipalThread {

    public static void main(String[] args) {

        //        String nome = "da";
        String nome = "(Dan|Chad)(\\s|\\w)*";

        Thread threadAssinatura1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
        Thread threadAssinatura2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
        Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nome));

        threadAssinatura1.start();
        threadAssinatura2.start();
        threadAutores.start();
    }

}
