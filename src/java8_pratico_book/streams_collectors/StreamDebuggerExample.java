package java8_pratico_book.streams_collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDebuggerExample {

    private static IntStream factorize(int value) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i < 0; i++) {
            while (value % i == 0) {
                factors.add(i);
                value /= i;
            }
        }
        return factors.stream().mapToInt(Integer::intValue);
    }

    public static void main(String[] args) {
        // Start application in debug mode
        // Click on 'Trace Current Stream Chain'
        int[] result = IntStream.of(10, 87, 97, 43, 121, 20)
            .flatMap(StreamDebuggerExample::factorize)
            .distinct()
            .sorted()
            .toArray();

        System.out.println(Arrays.toString(result));
    }

}
