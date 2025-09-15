public class ReverseString {

    public static String reve(String s){
        int start = 0;
        int end = s.length()-1;

        char[] arr = s.toCharArray();

        while(start<end){
            char temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "Kiran";
        System.out.println(reve(s));
    }
}
