/*A Map is a collection that stores data in key-value pairs.

Each key is unique, but values can be duplicate.

Belongs to java.util package.

Does not extend the Collection interface (it’s a separate hierarchy).
 */
/*HashMap<K, V> stores elements as key-value pairs.

Keys are unique, values can be duplicate.

Nulls:

Allows one null key.

Allows multiple null values.

No ordering → entries may appear in random order.

Backed by Hashing → uses hashCode() and equals() methods internally.

Not synchronized (not thread-safe).
 */

import java.util.HashMap;

public class HashMapDemo{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Kiran");
        map.put(2,"Dhoni");
        map.put(3,"Virat");
        map.put(4,"Rohit");
        map.put(5,"Raina");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(6,"Yuvraj"));
        System.out.println(map.remove(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Dhoni"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
    }
}