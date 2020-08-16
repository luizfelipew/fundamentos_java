package funcional_java8.exer8;

import org.junit.Test;

public class Exer8 {

    @Test
    public void exer8(){
        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();
        Forno forno = new Forno();
        forno.assar(calabresa);
        forno.assar(napolitana);
    }
}
