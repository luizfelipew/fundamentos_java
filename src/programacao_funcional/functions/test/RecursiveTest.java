package programacao_funcional.functions.test;


import org.junit.Test;

import java.util.TreeMap;

public class RecursiveTest {

    static class Tree {

        // campos publicos por motivo de simplicidade
        public final Tree left; // sub-arvore esquerda
        public final Tree right; // sub-arvore direita
        public final int value; // valor neste nodo

        public Tree(Tree left, Tree right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }


        @Override
        public String toString() {
            String leftStr = left == null ? "^" : left.toString();
            String rightStr = right == null ? "^" : right.toString();
            return "(" + leftStr + "-" + value + "-" + rightStr + ")";
        }

    }

    @Test
    public void walkTree() {
//        Tree root = new Tree(
//            new Tree(
//                new Tree(null,3,null),2,new Tree(new Tree(null,5,null),4,null)),
//            1,
//            new Tree(
//                new Tree(null,7,null),6,new Tree(null,8,null)));
    }

}
