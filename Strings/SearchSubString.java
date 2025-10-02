public class SearchSubString {
    static void Occurences(String s,char c){
        int first = s.indexOf(c);
        int last = s.lastIndexOf(c);
        System.out.println("First occurence of "+c+" : "+first);
        System.out.println("Lat occurence of "+c+" : "+last);
    }

    public static void main(String[] args) {
        String s = "hello world, welcome to the world of Java";
        char c = 'o';
        Occurences(s, c);
    }
}
