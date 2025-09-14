import java.util.HashMap;

public class FrequencyCount {
    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 4, 7, 2, 4, 9, 6};
        countFrequency(arr);
    }
}
