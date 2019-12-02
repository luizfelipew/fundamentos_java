package threads.banheiro;

public class Banheiro {

    // outra opcao eh usar o lock.lock(); comecano o processo e finalizando lock.unlock();
    // boolean locked = lock.tryLock(5, TimeUnit.SECONDS); //5s

    private boolean ehSujo = true;

    public void fazNumero1() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        //lock.lock();
        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");

            if (ehSujo) {
                esperaLaFora(nome);
            }

            System.out.println(nome + " fazendo coisa rapida");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
            //lock.unlock();
        }
    }


    public void fazNumero2() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");

            if (ehSujo) {
                esperaLaFora(nome);
            }

            System.out.println(nome + " fazendo coisa demorada");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }

    private void esperaLaFora(final String nome) {
        System.out.println(nome + ", eca, banheiro ta sujo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
