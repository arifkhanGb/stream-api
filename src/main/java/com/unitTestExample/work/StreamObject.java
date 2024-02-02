package com.unitTestExample.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {


//        1.Empty Object (blank stream)
        Stream<Object> emptyStream = Stream.empty();
        //emptyStream.forEach(e -> {System.out.println(e);});

        //2- way to create stream of Array , Object , collection
        String [] names = {"Arif", "jack", "sparrow" , "bond"};
       Stream<String> stream1 = Stream.of(names);
       stream1.forEach(e ->{
           System.out.println(e);
       });

       //3-
        Stream<Object> streamBuilder = Stream.builder().build();

        //4-
       IntStream stream2 =  Arrays.stream(new int[]{1,2,3,42,65});
       stream2.forEach(e ->{
           System.out.println(e);
       });

       //5- List, set
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(50);
        list2.add(12);
        list2.add(27);
        list2.add(87);

        Stream<Integer> stream3 = list2.stream();
        stream3.forEach(e ->{
            System.out.print(e);
        });
    }
}
