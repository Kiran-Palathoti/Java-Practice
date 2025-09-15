


// 🔹 1. Length & Character Access

// length() → Returns the length of the string.

// charAt(int index) → Returns the character at the given index.

// 🔹 2. Comparison

// equals(String str) → Checks if two strings are exactly equal.

// equalsIgnoreCase(String str) → Checks equality ignoring case.

// compareTo(String str) → Lexicographically compares two strings.

// 🔹 3. Substring

// substring(int beginIndex) → Returns substring from index to end.

// substring(int beginIndex, int endIndex) → Returns substring in range.

// 🔹 4. Search

// contains(CharSequence s) → Checks if substring exists.

// indexOf(String str) → Returns first occurrence index.

// lastIndexOf(String str) → Returns last occurrence index.

// startsWith(String prefix) / endsWith(String suffix) → Checks prefix/suffix.

// 🔹 5. Case Conversion

// toUpperCase() → Converts string to uppercase.

// toLowerCase() → Converts string to lowercase.

// 🔹 6. Trim & Replace

// trim() → Removes leading and trailing spaces.

// replace(char old, char new) → Replaces all occurrences.

// replaceAll(String regex, String replacement) → Replaces using regex.

// 🔹 7. Splitting & Joining

// split(String regex) → Splits string into array.

// join(CharSequence delimiter, CharSequence... elements) → Joins multiple strings.

// 🔹 8. Conversion

// toCharArray() → Converts string to char array.

// valueOf(anyType) → Converts value to string.

public class Example{
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("Hello World");
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5,9));
        System.out.println(str.contains("Hello"));
        System.out.println(str.charAt(10));
        System.out.println(str.equals(str2));
        System.out.println(str==str2);
        System.out.println(str==str3);
        System.out.println(str.equals(str3));

        str.concat("Hello");
        System.out.println(str);

    }
}