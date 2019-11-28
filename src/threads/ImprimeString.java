package threads;

public class ImprimeString implements Runnable {

    @Override
    public void run() {
        System.out.println("Resposta em forma de string utilizando uma thread");
    }

}
