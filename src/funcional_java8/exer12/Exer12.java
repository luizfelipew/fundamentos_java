package funcional_java8.exer12;

import funcional_java8.exer10.Matematica;
import org.junit.Test;

public class Exer12 {

    public void calcular(Matematica m){
        System.out.println(m.operar(10, 10));
    }

    @Test
    public void exer12(){
        calcular((Integer v1, Integer v2) -> {
            System.out.println("Corpo com lambda");
            return v1 / v2;
        });
    }
}
