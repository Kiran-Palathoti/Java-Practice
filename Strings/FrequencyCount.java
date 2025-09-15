
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void frequency(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=' '){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }
    }
    public static void main(String[] args) {
        String s = "Hello World";
        frequency(s);
    }
}
