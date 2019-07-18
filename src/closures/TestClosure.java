package closures;

import java.util.function.Consumer;

public class TestClosure {
    public static void main(String[] args) {
        String msg = "Testando";

        Runnable clos1 = () -> System.out.println(msg);
        clos1.run();

        Consumer<String> clos2 = (String s) -> System.out.println(s);
        clos2.accept("Testando2");
    }
}
