package java8streamsAPI;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class main {

    public static void main(String[] args) {

        List<Venda> vendas = new ArrayList<Venda>(){{
            add(new Venda(234, FormaPagamento.CARTAO));
            add(new Venda(99.5, FormaPagamento.CARTAO));
            add(new Venda(5674.98, FormaPagamento.DINHEIRO));
            add(new Venda(76.9, FormaPagamento.CARTAO));
        }};


        vendas.stream()
                .filter(v -> v.getFormaPagamento() == FormaPagamento.CARTAO)
                .sorted(comparing(Venda::getTotal))
                .map(Venda::getTotal)
                .forEach(System.out::println);

    }



}
