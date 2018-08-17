package exercicios;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=0;
        int contador=0;

        System.out.println("numero: ");
        numero = input.nextInt();


        // numero = 8
        // i = 2
        for (int i = 1; i <= numero; i++){
            if ( numero % i == 0 ){
                contador ++;
            }
        }

        if (contador==2){
            System.out.println("eh numero primo");
        } else {
            System.out.println("Nao eh numero primo");
        }

    }

}
