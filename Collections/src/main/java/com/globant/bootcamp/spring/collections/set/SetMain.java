package com.globant.bootcamp.spring.collections.set;

import java.util.*;

public class SetMain {
    public static void main(String[] args){
        //Creation

        Set<Integer> set = new HashSet<>();

        //Elements, not accepts duplicated

        set.add(4);
        set.add(67);
        set.add(3);
        set.add(0);
        set.add(4);

        System.out.println("Unsorted: " + set);

        //Sort

        //TODO HashSet is not ordered

        //Iteration

        for(Integer value: set){
            System.out.println("Value " + value);
        }
    }
}
