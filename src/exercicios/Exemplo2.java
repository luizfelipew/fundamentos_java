package exercicios;

public class Exemplo2 {
    public static void main(String[] args) {
        int[] list = {1,3,5,7,71,97,83};

        for (int i = 0; i <= list.length - 1; i++ ){
            if (isPrime(list[i])){
                System.out.println(list[i] + " eh primo");
            }
        }

    }

    private static boolean isPrime(long number) {
        number = Math.abs(number);

        if (number % 2 == 0){
            return false;
        }

        for (int i = 3; i * i <= number; i++ ){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }


}
