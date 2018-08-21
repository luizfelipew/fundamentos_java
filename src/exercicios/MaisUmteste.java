package exercicios;

public class MaisUmteste {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int contador = 1;

        for (int i = 1; i <= array.length - 1; i++){

            if (array[i] % contador == 0){
                contador++;
            }

            if (contador == 2){
                System.out.println("Este numero eh primo " + array[i]);
            } else {
                System.out.println("Este numero nao eh primo " + array[i]);
            }

        }

    }


}

