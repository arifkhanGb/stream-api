package com.unitTestExample.work;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethods {
    public static void main(String[] args) {

        List<String> names = List.of("Arif", "jack", "sparrow" , "bond");
        List<String> newList = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> numbers = List.of(1,2,5,9,3,4);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

//        names.stream().forEach(e ->{
//            System.out.println(e);
//        });

        //or
//        names.stream().forEach(System.out::println);


        //sorted
//        numbers.stream().sorted().forEach(System.out::print);

        //min function
        Integer min = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(min);

        //max function
        Integer max = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(max);
    }
}
