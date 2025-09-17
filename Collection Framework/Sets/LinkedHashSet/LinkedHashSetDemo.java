/*
 * LinkedHashSet is a subclass of HashSet.

It maintains a doubly-linked list of elements internally.

Unique elements only (like HashSet).

Preserves insertion order (unlike HashSet).

Allows one null value.

Performance is slightly slower than HashSet (because of maintaining order).
 */

import java.util.*;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
 
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Banana"); // duplicate ignored
        set.add(null);

        System.out.println("LinkedHashSet: " + set);

        // Checking element
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // Removing element
        set.remove("Banana");
        System.out.println("After removal: " + set);

        // Iterating
        for(String fruit : set) {
            System.out.println(fruit);
        }
    }
}
