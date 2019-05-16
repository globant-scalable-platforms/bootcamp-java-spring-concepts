package com.globant.bootcamp.spring.collections.challenge;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChallengeExampleMain {
    public static void main(String[] args){
        //Creation

        List<Integer> list = populate(new ArrayList<Integer>(), 10000000);

        long start = System.nanoTime();

        list.sort(Comparator.naturalOrder());

        long end = System.nanoTime();

        System.out.println("Time (Miliseconds): " + ((end - start)/1000000));
    }

    private static List<Integer> populate(ArrayList<Integer> objects, int amount) {
        return new Random()
                .ints()
                .limit(amount)
                .boxed()
                .collect(Collectors.toCollection(() -> objects));
    }
}
