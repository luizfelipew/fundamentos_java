package threads.principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public AcaoBotao(final JTextField primeiro, final JTextField segundo, final JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        Runnable tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado);
        Thread threadCalculo = new Thread(tarefa, "Thread Calculadora");

        //thread começa a trabalhar
        threadCalculo.start();
    }

}
