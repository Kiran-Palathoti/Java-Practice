// o(nlogn) using sorting
// o(n) using frequency
public class AnagramCheck {
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] freq = new int[26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    // sorting approach
//         char[] a = s1.toCharArray();
//         char[] b = s2.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         if(Arrays.equals(a,b)){
//             return true;
//         }
//         return false;

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        if(anagram(str1, str2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
    }
}
