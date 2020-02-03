//package programacao_funcional.functions;
//
//import java.util.List;
//
//import static java.util.Collections.emptyList;
//import static java.util.Collections.list;
//
//public class NaturalNumbers {
//
//    public static final int ZERO = 0;
//
//    public static int next(int previous) { return previous + 1; }
//
//    public static List<Integer> take(int count) {
//        return doTake(emptyList(), count);
//    }
//
//    private static List<Integer> doTake(List<Integer> accumulator, int count) {
//        if (count == ZERO) return accumulator;
//        else return doTake(list(next(count -1 ), accumulator), count - 1);
//    }
//
//}
