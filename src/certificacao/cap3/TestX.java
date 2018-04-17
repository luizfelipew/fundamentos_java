package certificacao.cap3;

public class TestX {
    int a = 100;

    public void method(){
        int a = 200; // Shadowing
        System.out.println(a);
    }

    public static void main(String[] args) {
        TestX testX = new TestX();

        testX.method();
    }
}
