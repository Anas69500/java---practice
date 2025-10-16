package stringpractice;

public class rmSpecialChar {
    public static void main(String[] args) {
        
        String str1 = "!H!ap@&py!$";
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            // System.out.println(ch);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                // System.out.println(ch);
                str2.append(ch);
            }

            
        }
        System.out.println(str2);
    }
}
