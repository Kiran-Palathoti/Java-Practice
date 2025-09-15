public class WordCount {
    public static int countWords(String s) {
        // trim() removes leading/trailing spaces
        // split("\\s+") splits by one or more spaces
        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "   Java is   awesome and powerful   ";
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);
    }
}

