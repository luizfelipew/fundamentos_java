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

            while (this.ehSujo) {
                esperaLaFora(nome);
            }

            System.out.println(nome + " fazendo coisa rapida");

            dormeUmPouco(5000);

            this.ehSujo = true;

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

            while (this.ehSujo) {
                esperaLaFora(nome);
            }

            System.out.println(nome + " fazendo coisa demorada");

            dormeUmPouco(10000);

            this.ehSujo = true;

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }

    private void dormeUmPouco(final long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void limpa() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {

            System.out.println(nome + " entrando no banheiro");

            if (!this.ehSujo) {
                System.out.println(nome + ", não está sujo, vou sair");
                return;
            }

            System.out.println(nome + " limpando o banheiro");
            this.ehSujo = false;

            try {
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.notifyAll();

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
