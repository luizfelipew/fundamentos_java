package alura_java8;

public class ExecThread {

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Executando um Runnable");
//            }
//        }).start();
        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}
