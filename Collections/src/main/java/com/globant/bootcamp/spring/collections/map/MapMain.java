package com.globant.bootcamp.spring.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args){
        //Creation

        Map<String, Integer> map = new HashMap<>();

        //Elements, not accepts duplicated

        map.put("four", 4);
        map.put("six-seven",67);
        map.put("three",3);
        map.put("zero",0);
        map.put("four",4);

        System.out.println("Unsorted: " + map);

        //Sort

        //TODO HashMap is not ordered

        //Iteration using entries

        for(Map.Entry<String, Integer> value: map.entrySet()){
            System.out.println("Entry " + value);
        }

        //Iteration using keys

        for(String value: map.keySet()){
            System.out.println("Key " + value);
        }

        //Iteration using values

        for(Integer value: map.values()){
            System.out.println("Value " + value);
        }
    }
}
