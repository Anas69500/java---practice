package practicequestion;
import java.util.Scanner;

public class countEvenOddDigit {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int num = Sc.nextInt();

        String str = Integer.toString(num);
        System.out.println(str);
        int even = 0;
        int odd = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
            if (ch % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The Count of Even number is " + even + " Odd number is " + odd);

        Sc.close();
    }
}
