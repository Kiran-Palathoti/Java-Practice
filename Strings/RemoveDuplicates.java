
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void duplicates(String s){
        Set<Character> set = new HashSet<>();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            set.add(c);
        }
        for(char a:set){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        String s = "aabbccdddeeffggg";
        duplicates(s);
    }
}
