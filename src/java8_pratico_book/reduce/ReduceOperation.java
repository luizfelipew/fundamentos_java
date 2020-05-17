package java8_pratico_book.reduce;

import java8_pratico_book.model.Usuario;
import java8_pratico_book.model.UsuarioToBuild;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.IntBinaryOperator;

public class ReduceOperation {

    public static void main(String[] args) {
        UsuarioToBuild usuarioToBuild = new UsuarioToBuild();
        List<Usuario> usuarios = usuarioToBuild.getUsuarios();

        double pontuacaoMedia = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .average()
            .getAsDouble();

        System.out.println(pontuacaoMedia);

        Optional<Usuario> max = usuarios.stream()
            .max(Comparator.comparing(Usuario::getPontos));

        Usuario maximaPontuacao = max.get();
        System.out.println(maximaPontuacao);

        int total = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .sum();
        System.out.println(total);

        int valorInicial = 0;
        IntBinaryOperator operacao = (a, b) -> a + b;

        int totalUsuarios = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .reduce(valorInicial, operacao);
        System.out.println(totalUsuarios);

//        int totalUsuariosSucintos = usuarios.stream()
//            .mapToInt(Usuario::getPontos)
//            .reduce(0, (a, b) -> a + b);

        System.out.println("==============================");

        int totalUsuariosSucintos = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .reduce(0, Integer::sum);

        System.out.println(totalUsuariosSucintos);

        System.out.println("========= Multiplicacao =====================");

        int multiplicacao = usuarios.stream()
            .mapToInt(Usuario::getPontos)
            .reduce(1, (a, b) -> a * b);
        System.out.println(multiplicacao);

        System.out.println("========= Soma sem map =====================");
        int totalSemMap = usuarios.stream()
            .reduce(0, (atual, u) -> atual + u.getPontos(), Integer::sum);

        System.out.println(totalSemMap);



    }

}
