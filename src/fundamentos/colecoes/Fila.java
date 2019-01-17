package fundamentos.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Maria");
        fila.offer("Jão");
        fila.add("Pedro");

        System.out.println("Peek/Element ....");
        System.out.println(fila.peek()); // fila vazia retorna nulo
        System.out.println(fila.element()); // fila vazia retorna um erro

        System.out.println("Poll/Remove ....");
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // fila vazia retorna nulo
        System.out.println(fila.remove()); // fila vazia retorna um erro

    }
}
