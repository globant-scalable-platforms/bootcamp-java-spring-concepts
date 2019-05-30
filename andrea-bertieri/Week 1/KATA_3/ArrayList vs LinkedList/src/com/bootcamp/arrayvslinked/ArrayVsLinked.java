package com.bootcamp.arrayvslinked;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayVsLinked {

	public static void main(String[] args) {
		
		List<Integer> arrays = populate(new ArrayList<Integer>(), 10000000);
		List<Integer> linkeds = populate(new LinkedList<Integer>(), 10000000);
		long start;
		long end;
		int remover= 5000;
		
		System.out.println("WELLCOME: Today an ArrayList and LinkedList will be faced\nWhich will the winner be?");
		
		//Adding a new element
		System.out.println("\nADDING A NEW ELEMENT");
		start= System.nanoTime();
		arrays.addAll(arrays);
		end = System.nanoTime();

	    System.out.println("Arrays time (Miliseconds): " + ((end - start)/1000000));
	    
	    start= System.nanoTime();
		linkeds.addAll(linkeds);
		end = System.nanoTime();

	    System.out.println("Linkeds time (Miliseconds): " + ((end - start)/1000000));
	    System.out.println("The winner is ArrayList");
		
		//Removing an element from the middle
	    System.out.println("\nREMOVING AN ELEMENT FROM THE MIDDLE");
	    start= System.nanoTime();
		arrays.remove(remover);
		end = System.nanoTime();

	    System.out.println("Arrays time (Nanoseconds): " + (end - start));
	    
	    start= System.nanoTime();
		linkeds.remove(remover);
		end = System.nanoTime();

	    System.out.println("Linkeds time (Nanoseconds): " + (end - start));
	    System.out.println("The winner is LinkedList");
		
		//Inserting an element to the middle
	    System.out.println("\nINSERTING AN ELEMENT FROM THE MIDDLE");
	    start= System.nanoTime();
		arrays.add(remover,655);
		end = System.nanoTime();

	    System.out.println("Arrays time (Nanoseconds): " + (end - start));
	    
	    start= System.nanoTime();
		linkeds.add(remover,655);
		end = System.nanoTime();

	    System.out.println("Linkeds time (Nanoseconds): " + (end - start));
	    System.out.println("The winner is LinkedList");
	    
		//Iterate over the whole collection
	    System.out.println("\nITERATING THE WHOLE COLLECTION");
	    start= System.nanoTime();
	    for(Integer value: arrays){
           // System.out.println("Value " + value);
        }
	    end = System.nanoTime();
	    System.out.println("Arrays time (Miliseconds): " + ((end - start)/1000000));
	    
	    start= System.nanoTime();
	    for(Integer value: linkeds){
           // System.out.println("Value " + value);
        }
	    end = System.nanoTime();
	    System.out.println("Linkeds time (Miliseconds): " + ((end - start)/1000000));
	    System.out.println("The winner is ArrayList");
	    
		//Sorting Colecction
	    System.out.println("\nSORTING COLLECTION");
	    start= System.nanoTime();
	    arrays.sort(Comparator.naturalOrder());
	    end = System.nanoTime();
	    System.out.println("Arrays time (Miliseconds): " + ((end - start)/1000000));
	    start= System.nanoTime();
	    linkeds.sort(Comparator.naturalOrder());
	    end = System.nanoTime();
	    System.out.println("Linkeds time (Miliseconds): " + ((end - start)/1000000));
	    System.out.println("The winner is  ArrayList");

	}
	
	 private static List<Integer> populate(List<Integer> objects, int amount) {
	        return new Random()
	                .ints()
	                .limit(amount)
	                .boxed()
	                .collect(Collectors.toCollection(() -> objects));
	 }
	 
	

}
