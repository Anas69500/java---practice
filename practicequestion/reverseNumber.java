// it will reverse a given number

package practicequestion;

// import Scanner to take input from user
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two digit number: ");
        while (true) {
            
            int num = sc.nextInt();
            int rev = 0;

            if (num > 9) {
                while (num != 0) {
                    int digit = num % 10;//it store reminder like from 1234 % 10 = 4

                    rev = rev * 10 + digit;//0 * 10 + 4 = 4 in next loop 4 * 10 + 3 = 43 soon

                    num = num / 10;// it will help to remove last digit from num like 1234 / 10 = 123.4 int only store 123
                    System.out.print(rev);
                }
                break;
                
            } else {
                System.out.print("please Enter a two digit number:");
            }
        }
        sc.close();
        
    }
}
