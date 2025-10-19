package practicequestion;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to check is palindrome or not: ");
        String str = sc.next();
        //covert to lower case
        str = str.toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();
        
        if (str.equals(rev)) {
            System.out.println("This word is palindrome");
        } else {
            System.out.println("This word is not palindrome");
        }

    }
    
}
