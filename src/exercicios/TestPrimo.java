package exercicios;

public class TestPrimo {
    public static void main(String[] args) {
        int[] n = {1,3,7,71,4,87};

        for (int i = 1; i <= n.length -1; i++){

            if (isPrime(n[i])){
                System.out.println(n[i] + " eh primo");
            }
        }


    }

    public static boolean isPrime(long number){
        number = Math.abs(number);
        if(number % 2 == 0){
            return false;
        }
        for (int i = 3; i * i <= number; i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }


}
