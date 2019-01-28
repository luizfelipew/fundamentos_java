package java8streamsAPI.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Hamilton", "George");


        List<String> result = names.parallelStream()
                                    .filter(name -> name.startsWith("J"))
                                    .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
