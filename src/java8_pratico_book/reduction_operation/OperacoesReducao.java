package java8_pratico_book.reduction_operation;

import java8_pratico_book.model.Usuario;
import java8_pratico_book.model.UsuarioToBuild;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.IntBinaryOperator;

public class OperacoesReducao {

    public static void main(String[] args) {
        UsuarioToBuild usuarioToBuild = new UsuarioToBuild();
        List<Usuario> usuarios = usuarioToBuild.getUsuarios();

        double pontuacaoMedia = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .average()
            .getAsDouble();

        System.out.println(pontuacaoMedia);
        System.out.println("=================");

        Optional<Usuario> max = usuarios.stream()
            .max(Comparator.comparing(Usuario::getPontos));

        Usuario maximaPontuacao = max.get();
        System.out.println(maximaPontuacao);
        System.out.println("=================");

        int total = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .sum();

        System.out.println("Total somado dos usuarios: " + total);
        System.out.println("=================");

        int valorInicial = 0;
        IntBinaryOperator operacao = (a, b) -> a + b;

        int reduceBinaryOperator = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .reduce(valorInicial, operacao);

        int reduceDeOutraForma = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .reduce(0, (a, b) -> a + b);

        int reduceMethodReference = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .reduce(0, Integer::sum);

        int reduceMultiplicacao = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .reduce(1, (a, b) -> a * b);

        // soma sem o map eh menos custoso
        Integer reduceSemMap = usuarios.stream()
            .reduce(0, (atual, u) -> u.getPontos(), Integer::sum);



    }

}
