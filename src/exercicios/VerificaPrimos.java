package exercicios;

public class VerificaPrimos {

    public void calculaPrimo(int[] vetor){
        int cont = 0;

        for (int m = 0; m <= vetor.length; m++){
            int primo = vetor[m];

            for (int i = 2; i <= vetor.length; i++){
                if(((primo % i ) == 0) && (i != primo )){
                    cont ++;
                    break;
                }
            }
        }

        System.out.println("Quantidade de números primos: " + cont);
    }
}
