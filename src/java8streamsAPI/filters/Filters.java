package java8streamsAPI.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Hamilton", "George");

        for (String name : names){
            System.out.println(name);
        }


        List<String> result = names.stream()
                                    .filter(name -> name.startsWith("J"))
                                    .collect(Collectors.toList());
//        result.forEach(element -> System.out.println(element));
        result.forEach(System.out::println);

        String result2 = names.stream()
                    .filter(name -> name.startsWith("J"))
                    .collect(Collectors.joining(", "));

        System.out.println(result2);

    }
}
