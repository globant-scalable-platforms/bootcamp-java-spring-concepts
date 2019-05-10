package com.globant.bootcamp.spring.collections.queue;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QueueMain {
    public static void main(String[] args){
        //Creation

        Queue<Integer> queue = new PriorityQueue<>();

        //Elements, accepts duplicated

        queue.add(4);
        queue.add(67);
        queue.add(3);
        queue.add(0);
        queue.add(4);

        System.out.println("Unsorted: " + queue);

        //Sort

        //TODO Queue is not ordered

        //Iteration

        for(Integer value: queue){
            System.out.println("Value " + value);
        }

        //Poll and

        Integer value = queue.peek();

        System.out.println("Peek " + value);

        value = queue.poll();

        System.out.println("Poll " + value);

        value = queue.poll();

        System.out.println("Poll " + value);

        value = queue.poll();

        System.out.println("Poll " + value);

        value = queue.poll();

        System.out.println("Poll " + value);

        value = queue.poll();

        System.out.println("Poll " + value);
    }
}
