package java_efetivo_book;

public class StaticFactory {

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String[] args) {
        System.out.println(valueOf(true));
    }

}
