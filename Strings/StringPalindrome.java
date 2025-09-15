public class StringPalindrome {
    public static boolean palindrome(String s){
        s = s.toLowerCase();
        int left = 0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "RACECAR";
        if(palindrome(str)){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}
