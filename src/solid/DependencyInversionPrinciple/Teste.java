package solid.DependencyInversionPrinciple;

public class Teste {
    public static void main(String[] args) {
        TabelaDePreco tabela = new TabelaDePrecoPadrao();
        ServicoDeEntrega entrega = new Frete();

        CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);

    }
}
