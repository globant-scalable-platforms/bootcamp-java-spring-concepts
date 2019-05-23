package com.globant.bootcamp.spring.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMain {
    public static void main(String[] args){
        //Creation

        List<Integer> list = new ArrayList<Integer>();

        //Elements, accepts duplicated

        list.add(4);
        list.add(67);
        list.add(3);
        list.add(0);
        list.add(4);

        System.out.println("Unsorted: " + list);
        System.out.println("-----------------------------");

        //Sort

        list.sort(Comparator.naturalOrder());

        System.out.println("Sorted: " + list);
        System.out.println("-----------------------------");

        //Iteration

        for(Integer value: list){
            System.out.println("Value " + value);
        }
        System.out.println("-----------------------------");
    }
}
