/*
 * A Set is a collection that:

Does not allow duplicate elements.

Does not guarantee index-based access (unlike List).

May or may not maintain insertion order (depends on implementation).

Defined in java.util package.

Common implementations:

HashSet

LinkedHashSet

TreeSet
 */

 /*
  * A HashSet is a collection that:

Stores unique elements only (no duplicates).

Does not maintain insertion order (elements are stored based on hash values).

Allows null value (but only one null).

Backed by a HashMap internally (keys are the elements, values are dummy objects).

Belongs to java.util package.

Implements the Set interface.
  */
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Car");
        set.add("Bike");
        set.add("Lorry");
        set.add("Train");
        set.add("Flight");
        set.add("Bike");
        System.out.println(set);

        set.remove("Lorry");
        System.out.println(set);
        System.out.println(set.contains("Bike"));
        System.out.println(set.size());
        for(String s:set){
            System.out.print(s+" ");
        }
        System.out.println();

         Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println("Iterator: " + itr.next());
        }
    }
}