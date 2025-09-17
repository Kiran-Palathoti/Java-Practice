
import java.util.TreeSet;

/*TreeSet is a class in Java that implements the Set interface using a TreeMap internally.

Stores elements in sorted (ascending) order by default.

Does not allow duplicates.

Does not allow null (throws NullPointerException if you try to add).

Implements the NavigableSet interface → provides navigation methods like higher(), lower(), ceiling(), floor().
 */

public class TreeSetDemo{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(7);
        set.add(3);
        set.add(5);
        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.size());
        System.out.println(set.headSet(4));
        System.out.println(set.tailSet(3));
        System.out.println(set.subSet(2,4));
        System.out.println(set.higher(2));
        System.out.println(set.lower(4));
        System.out.println(set.ceiling(4));
        System.out.println(set.floor(4));
    }
}