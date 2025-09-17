/*A List is an ordered collection (elements are stored in the order you insert them).

Allows duplicate elements.

Provides index-based access (you can get, update, or remove elements by index).

Defined in the java.util package.*/


/*
 * ArrayList

Resizable array implementation of List.

Fast for searching (get, set).

Slower for insert/delete in the middle (because shifting happens).

Allows duplicates.

Maintains insertion order.

Not synchronized (not thread-safe).
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
    public static void main(String[] args){
        List<String> s = new ArrayList<>();
        s.add("Apple");
        s.add("Mango");
        s.add("Grapes");
        s.add("Orange");
        s.add("Banana");
        System.out.println(s);

        s.add(2,"Pineapple");
        System.out.println(s);
        System.out.println(s.get(3));
        s.set(3,"Guava");
        System.out.println(s);
        s.remove(2);
        System.out.println(s);
        s.remove("Mango");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.contains("Mango"));
        System.out.println(s.indexOf("Apple"));
        System.out.println(s.isEmpty());
        s.clear();
        System.out.println(s);
    }
}