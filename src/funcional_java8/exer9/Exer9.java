package funcional_java8.exer9;

import funcional_java8.exer8.Forno;
import org.junit.Test;

public class Exer9 {

    @Test
    public void exer9(){
        Forno forno = new Forno();
        forno.assar(()-> System.out.println("Pizza lambda"));
        forno.assar(()-> {
            System.out.println("molho");
            System.out.println("queijo");
            System.out.println("azeitona");
        });

    }
}
