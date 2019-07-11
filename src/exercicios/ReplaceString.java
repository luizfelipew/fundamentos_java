package exercicios;

public class ReplaceString {
    public static void main(String[] args) {

        String str = "( teste de parenteses )";

        String result = str.replace("(", "").replace(")", "");

        System.out.println(result);
    }
}
