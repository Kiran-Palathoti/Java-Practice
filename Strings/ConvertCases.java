public class ConvertCases {
    static void convert(String s){
        String[] words = s.split(" +");
        String titleCase = "";
        for(String word:words){
            titleCase+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println("Title case: "+titleCase.trim());
    }
    public static void main(String[] args) {
        String s = "hello world";
        convert(s);
    }
}
