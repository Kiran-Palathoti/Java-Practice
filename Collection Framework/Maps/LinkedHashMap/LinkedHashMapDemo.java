import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Kiran");
        map.put(2, "Dhoni");
        map.put(3, "Virat");
        map.put(4, "Rohit");
        map.put(5, "Raina");

        System.out.println(map); 
        System.out.println(map.get(2));             
        System.out.println(map.getOrDefault(10,"Yuvraj")); 
        System.out.println(map.containsKey(3));     
        System.out.println(map.containsValue("Rohit"));
        System.out.println(map.keySet());           
        System.out.println(map.values());           
        System.out.println(map.entrySet());         
    }
}
