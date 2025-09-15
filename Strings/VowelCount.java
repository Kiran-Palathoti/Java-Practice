public class VowelCount {
    public static void vowelConsonant(String s){
        s = s.toLowerCase();
        int vowelCount = 0;
        int consonantCount=0;
        int digitsCount = 0;
        int specialCharacterCount = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                if(c =='a' || c =='e' || c == 'i' || c == 'o' || c =='u'){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }
            else if(c>='0' && c<='9'){
                digitsCount++;
            }
            else if(c!=' '){
                specialCharacterCount++;
            }
        }
        System.out.println("Vowel count: "+vowelCount);
        System.out.println("Consonant count: "+consonantCount);
        System.out.println("Digit count: "+digitsCount);
        System.out.println("Special Character count: "+specialCharacterCount);
    }
    public static void main(String[] args) {
        String s = "Hello World 77@#$";
        vowelConsonant(s);
    }
}
