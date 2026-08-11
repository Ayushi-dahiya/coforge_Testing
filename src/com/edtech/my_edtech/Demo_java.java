package com.edtech.my_edtech;

import java.util.PriorityQueue;
import java.util.Iterator;

public class Demo_java {
    public static void main(String[] args) {

        // Create PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. ADD elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(40);

        System.out.println("Priority Queue: " + pq);

        // 2. ACCESS the head element
        System.out.println("Head element using peek(): " + pq.peek());

        // 3. REMOVE the head element
        System.out.println("Removed element using poll(): " + pq.poll());
        System.out.println("Priority Queue after poll(): " + pq);

        // Remove a specific element
        pq.remove(20);
        System.out.println("After removing 20: " + pq);

        // 4. ITERATION using Iterator
        System.out.println("Iteration using Iterator:");

        Iterator<Integer> itr = pq.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}