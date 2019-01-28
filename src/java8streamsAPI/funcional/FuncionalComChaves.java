package java8streamsAPI.funcional;

import java8streamsAPI.map_reduce.Persona;

import java.util.Arrays;
import java.util.List;

public class FuncionalComChaves {
    public static void main(String[] args) {
        List<Persona> people = Arrays.asList(new Persona("John", 26),
                new Persona("Jack", 40),
                new Persona("Hamilton", 14),
                new Persona("George", 63));


        people.stream()
                .filter(p -> p.getAge() > 0)
                .forEach(p -> {
                    System.out.println(p.getAge());
                    System.out.println(p.getName());
                });
//
////
//        people.stream()
//                .filter(p -> p.getAge() > 0)
//                .forEach(System.out::println);
    }
}
