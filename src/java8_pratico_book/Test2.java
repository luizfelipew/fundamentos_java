package java8_pratico_book;

public class Test2 {

    public static void main(String[] args) {
        //        Runnable o = () -> System.out.println("O que eu sou? Qua lambda");
        //
        //        System.out.println(o);
        //        System.out.println(o.getClass());
        final int numero = 5;
        new Thread(() -> {
            System.out.println(numero);
        }).start();

    }

}
