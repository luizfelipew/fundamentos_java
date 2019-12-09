package threads.banco;

public class TarefaAcessaBancoProcedimento implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaAcessaBancoProcedimento(final PoolDeConexao pool, final GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {

        synchronized (tx){
            System.out.println("comecando a tx");
            tx.begin();

            synchronized (pool) {
                System.out.println("peguei a conexao");
                pool.getConnection();
            }
        }
    }

}
