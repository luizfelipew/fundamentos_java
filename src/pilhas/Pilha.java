package pilhas;

public class Pilha {
    public Object[] pilha;

    public int posicaoPilha;

    public Pilha(){
        this.posicaoPilha = -1;
        this.pilha = new Object[10];
    }

    public Boolean pilhaVazia() {
        if(this.posicaoPilha == -1){
            return true;
        }
        return false;
    }

    public int tamanho(){
        if(this.pilhaVazia()){
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public void empilhar(Object valor){
        //push
        if (this.posicaoPilha < this.pilha.length - 1){
            // verifica se a posicaoPilha é menor do que o tamanho da pilha,
            //se for, então é inserido o valor na pilha e ao mesmo tempo é feito
            //o incremento do atributo posicaoPilha
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public Object desempilhar(){
        //pop
        if (pilhaVazia()){
            return null;
            // primeiro verificamos se a pilha esta vazia,
            //se estiver, nada será realizado
        }
        return this.pilha[this.posicaoPilha --];
        // aqui retorna o que tem na última posição da pilha
        //e decrementa o atributo posicaoPilha

    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}
