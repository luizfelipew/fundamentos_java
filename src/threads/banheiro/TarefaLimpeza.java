package threads.banheiro;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TarefaLimpeza(final Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.limpa();

        while(true) {
            this.banheiro.limpa();
            try {
                Thread.sleep(15000); //limpando cada 15s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
