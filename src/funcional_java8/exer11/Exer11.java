package funcional_java8.exer11;

import funcional_java8.exer10.Matematica;
import org.junit.Test;

public class Exer11 {

    public void calcular(Matematica m){
        System.out.println(m.operar(10, 10));
    }

    @Test
    public void exer11(){
        calcular((v1, v2) -> {
            return v1 + v2;
        });

        calcular((v1, v2) -> {
            System.out.println("\nCorpo do lambda");
            return v1 - v2;
        });
    }
}
