/*A TreeMap stores key-value pairs in sorted order of keys (natural order by default).

Belongs to java.util package.

Implements NavigableMap (which extends SortedMap).

Internally uses a Red-Black Tree (a type of self-balancing BST).
 */
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Virat");
        map.put(1, "Kiran");
        map.put(5, "Raina");
        map.put(4, "Rohit");
        map.put(2, "Dhoni");

        System.out.println(map); 
        // Methods
        System.out.println(map.firstKey());   
        System.out.println(map.lastKey());    
        System.out.println(map.headMap(3));  
        System.out.println(map.tailMap(3));  
        System.out.println(map.subMap(2, 5)); 
        System.out.println(map.ceilingKey(3)); 
        System.out.println(map.floorKey(3));   
    }
}
