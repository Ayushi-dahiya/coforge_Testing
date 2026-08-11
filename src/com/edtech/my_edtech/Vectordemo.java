package com.edtech.my_edtech;

import java.util.Vector;
import java.util.Iterator;

public class Vectordemo {

    public static void main(String[] args) {

        // Create Vector
        Vector<String> v = new Vector<>();

        // 1. ADD elements
        v.add("Java");
        v.add("Python");
        v.add("C++");
        v.add("SQL");

        System.out.println("Original Vector: " + v);

        // 2. UPDATE element
        v.set(1, "C#");

        System.out.println("After updating: " + v);

        // 3. REMOVE element
        v.remove("C++");

        System.out.println("After removing C++: " + v);

        // Remove using index
        v.remove(0);

        System.out.println("After removing index 0: " + v);

        // 4. ITERATE using for-each loop
        System.out.println("Iterating Vector:");

        for (String element : v) {
            System.out.println(element);
        }

        // 5. ITERATE using Iterator
        System.out.println("Using Iterator:");

        Iterator<String> itr = v.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}