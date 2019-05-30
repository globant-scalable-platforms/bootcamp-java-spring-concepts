package com.bootcamp.HashMapvsTreeMap;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapvsTreeMap {

	public static void main(String[] args) {
		Map<Integer, String> map = populate(new HashMap<Integer, String>());
		Map<Integer, String> treeMap = populate(new TreeMap<Integer, String>());
		long start;
		long end;
		
		System.out.println("WELLCOME: Today a Map and a treeMap will be faced\nWhich will the winner be?");
		
		//Putting a new element
		System.out.println("\nPUTTING A NEW ELEMENT");
		start= System.nanoTime();
		map.put(55,"Cat");
		end = System.nanoTime();

	    System.out.println("treeMap's time (Miliseconds): " + ((end - start)));
	    
	    start= System.nanoTime();
	    treeMap.put(55,"Cat");
		end = System.nanoTime();

	    System.out.println("HashMap's time (Miliseconds): " + ((end - start)));
	    System.out.println("The winner is random. There is no a winner");
		
		//Find an element by Key
	    System.out.println("\nFINDING AN ELEMENT BY KEY");
		start= System.nanoTime();
		map.put(1,"January");
		end = System.nanoTime();

	    System.out.println("treeMap's time (Miliseconds): " + ((end - start)));
	    
	    start= System.nanoTime();
	    treeMap.put(1,"Jamuary");
		end = System.nanoTime();

	    System.out.println("HashMap's time (Miliseconds): " + ((end - start)));
	    System.out.println("The winner is TreeMap");
		
		//Remove an element by key
	    System.out.println("\nREMOVING AN ELEMENT BY KEY");
		start= System.nanoTime();
		map.remove(1);
		end = System.nanoTime();

	    System.out.println("treeMap's time (Miliseconds): " + ((end - start)));
	    
	    start= System.nanoTime();
	    treeMap.remove(1);
		end = System.nanoTime();

	    System.out.println("HashMap's time (Miliseconds): " + ((end - start)));
	    System.out.println("The winner is TreeMap");

	    
		//Iterate over the whole entries
	 

	}
	
	 private static Map<Integer, String> populate(Map<Integer, String> objects ){
		 objects.put(1,"January");
		 objects.put(2,"Frebruary");
		 objects.put(3,"March");
		 objects.put(4,"April");
		 objects.put(5,"May");
		 objects.put(6,"June");
		 objects.put(7,"July");
		 objects.put(8,"August");
		 objects.put(9,"September");
		 objects.put(10,"October");
		 objects.put(11,"November");
		 objects.put(12,"December");
		 
	        return objects ;
	 }
	

}
