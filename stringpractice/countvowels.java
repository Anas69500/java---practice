package stringpractice;

public class countvowels {
    public static void main(String[] args) {
        String str = "hello my friend! how it going";
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char nv = str.charAt(i); 
            if (nv == 'a' || nv == 'e' || nv == 'i' || nv == 'o' || nv == 'u') {
                vowels++;
            }
        }
        System.out.println("The number of vowels are: " + vowels);
    }
}
