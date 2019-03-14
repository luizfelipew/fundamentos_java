package exercicios;

import java.util.Scanner;

public class RecursivoSimple {

    public static int somaAlgarismos(int num){

        if (num < 10) {
            return num;
        } else {
            return somaAlgarismos(num/10) + num % 10;
        }

    }

    public static void main(String[] args) {

        System.out.println("Digite um numero: ");
        int num = new Scanner(System.in).nextInt();
        int soma = somaAlgarismos(num);
        System.out.println("A soma dos algarismos é: " + soma);
    }
}
