package solid.SingleResponsabilyPrinciple;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.calculaSalario(funcionario);
    }
}
