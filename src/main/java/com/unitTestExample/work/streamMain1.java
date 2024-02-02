package com.unitTestExample.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMain1 {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(2,3,7,4,5,8);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(50);
        list2.add(12);
        list2.add(27);
        list2.add(87);

        List<Integer> list3 = Arrays.asList(13,34,54,23);

        //without stream
        List<Integer> ListEven = new ArrayList<>();
        for (Integer i : list1)
        {
            if(i%2==0)
                ListEven.add(i);
        }
        System.out.println(ListEven);

        //with stream
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(i -> i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        //OR

        List<Integer> newList= list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1= list3.stream().filter(i -> i>10).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
