package java8_pratico_book.method_reference;

import java8_pratico_book.model.Usuario;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

public class MethodReferenceConstructor {

    public static void main(String[] args) {

        Supplier<Usuario> criadorDeUsuarios = Usuario::new;
        Usuario novo = criadorDeUsuarios.get();


        Function<String, UsuarioMethod> criadoreDeUsuariosFunction = UsuarioMethod::new;
        UsuarioMethod felipeXablau = criadoreDeUsuariosFunction.apply("Felipe xablau");
        UsuarioMethod patriciaMaionese = criadoreDeUsuariosFunction.apply("Patricia Maionese");

        BiFunction<String, Integer, Usuario> criadorUsuariosBiFunction = Usuario::new;
        Usuario testeBiFucntion = criadorUsuariosBiFunction.apply("Teste BiFucntion um", 100);
        Usuario testeNormalDeBiFunction = criadorUsuariosBiFunction.apply("Teste Normal de BiFunction", 144);

        System.out.println(testeBiFucntion);
        System.out.println(testeNormalDeBiFunction);



        CriadorDeUsuariosBiFunction criadorDeUsuariosBiFunction = new CriadorDeUsuariosBiFunction();

        Usuario pati = criadorDeUsuariosBiFunction.apply("Pati", 10000);
        System.out.println(pati);

        BiFunction<Integer, Integer, Integer> max = Math::max;
        ToIntBiFunction<Integer, Integer> max2 = Math::max;
        IntBinaryOperator max3 = Math::max;




    }
}
