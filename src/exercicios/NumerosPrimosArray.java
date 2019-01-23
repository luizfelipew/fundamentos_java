package exercicios;

public class NumerosPrimosArray {

    private static int listPrimo;

    public static void main(String[] args) {
        int[] listPrimos = {2,3,5,7,10};
        int count = 0;


        for (int i = 1; i <= listPrimos.length; i++ ){
            if (listPrimos[i] % 2 == 0){

                System.out.println(listPrimos[i] + " nao eh numero primo");
            }
        }

    }
}
