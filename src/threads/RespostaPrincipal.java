package threads;

public class RespostaPrincipal {

    public static void main(String[] args) throws InterruptedException {

        Runnable resposta = new ImprimeString();
        Thread thread = new Thread(resposta);
        Thread.sleep(5000);

        // Startando a thread
        thread.start();

        // pode ser feito dessa forma tb
//        Thread.sleep(5000);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Resposta em forma de string utilizando uma thread sendo feito na main");
//            }
//        }).start();
    }

}
