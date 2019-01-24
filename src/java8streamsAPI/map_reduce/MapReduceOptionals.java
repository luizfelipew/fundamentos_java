package java8streamsAPI.map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MapReduceOptionals {
    public static void main(String[] args) {
        List<Persona> people = Arrays.asList(new Persona("John", 26),
                new Persona("Jack", 40),
                new Persona("Hamilton", 14),
                new Persona("George", 63));


        OptionalInt result = people.stream()
                .filter(p -> p.getAge() > 20)
                .mapToInt(Persona::getAge)
                .reduce((a, b) -> a + b);

        if (result.isPresent()){
            System.out.println(result.getAsInt());
        }

    }
}
