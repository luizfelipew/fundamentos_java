package java8streamsAPI.map_reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduce {
    public static void main(String[] args) {

        // inserir

        List<Persona> people = Arrays.asList(new Persona("John", 26),
                new Persona("Jack", 40),
                new Persona("Hamilton", 14),
                new Persona("George", 63));


        people.stream()
                .filter(p -> p.getAge() > 20)
                //.map(p -> p.getName().toUpperCase())
                .map(Persona::getName)
                .forEach(System.out::println);

    }


//    fazer com Collectors tomap
}
