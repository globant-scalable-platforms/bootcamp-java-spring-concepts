package com.bootcamp.HashMapvsTreeMap;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapvsTreeMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		long start;
		long end;
		int remover= 5000;
		
		System.out.println("WELLCOME: Today a Map and a treeMap will be faced\nWhich will the winner be?");
		
		//Putting a new element
		System.out.println("\nPUTTING A NEW ELEMENT");
		start= System.nanoTime();
		map.put(4,"four");
		end = System.nanoTime();

	    System.out.println("Map's time (Miliseconds): " + ((end - start)));
	    
	    start= System.nanoTime();
	    treeMap.put(4,"four");
		end = System.nanoTime();

	    System.out.println("HashMap's time (Miliseconds): " + ((end - start)));
	    System.out.println("The winner is HashMap");
		
		//Find an element by Key

		
		//Remove an element by key

	    
		//Iterate over the whole entries
	 

	}
	
	private static List<Integer> populate(List<Integer> objects, int amount) {
        return new Random()
                .ints()
                .limit(amount)
                .boxed()
                .collect(Collectors.toCollection(() -> objects));
 }

}
