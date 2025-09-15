// String Builder Concept
// It is mutable and not thread safe

public class Problem1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb);
    }
}
