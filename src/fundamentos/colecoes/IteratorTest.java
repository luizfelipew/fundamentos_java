package fundamentos.colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
