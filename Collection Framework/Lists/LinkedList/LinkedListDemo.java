
import java.util.LinkedList;

/* 
 * LinkedList

Doubly linked list implementation of List.

Fast for insert/delete at beginning or middle.

Slower for accessing elements by index.

Allows duplicates.

Maintains insertion order.

Implements both List and Deque (so it can work like a queue too).
 */

public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Toyota");
        list.add("Mercedes");
        list.add("Tesla");
        list.add("Bugatti");
        list.add("Swift");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
        list.set(4,"Lamborgini");
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        list.remove("Tesla");
        System.out.println(list);
        System.out.println(list.contains("Bugatti"));
        System.out.println(list.indexOf("Mercedes"));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
    }
}