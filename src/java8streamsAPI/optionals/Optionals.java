package java8streamsAPI.optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

        List<String> names =  Arrays.asList("John", "Jack", "Hamilton", "George");

        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("W"))
                .findAny();

        if (!result.isPresent()){
            System.out.println("Not Found");
        }

//        result.ifPresent(p -> p.startsWith("H"));
//
//        System.out.println(result);
//        names.stream()
//                .filter(name -> name.startsWith("W"))
//                .findAny()
//                .orElseThrow(IllegalStateException::new);

        // antes do optional estudar flatMap

    }
}
