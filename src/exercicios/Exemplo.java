package exercicios;

public class Exemplo {
    public static void main(String[] args) {
        int[] lista = {1,2,5,6,7,71,83};

        for (int i = 0; i <= lista.length - 1; i++){
            if (isPrime(lista[i])){
                System.out.println(lista[i] + " eh primo");
            }
        }

    }


    public static boolean isPrime(long number){
        number = Math.abs(number);

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i ++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
}
