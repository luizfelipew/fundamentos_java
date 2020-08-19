package funcional_java8.exer10;

import org.junit.Test;

public class Exer10 {

    public void calcular(Matematica m){
        System.out.println(m.operar(10, 10));
    }

    @Test
    public void exer10(){
        calcular((v1, v2) -> v1 + v2);
        calcular((v1, v2) -> v1 - v2);
        calcular((a, b) -> a * b);
    }
}
