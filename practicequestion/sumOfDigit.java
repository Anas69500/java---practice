// it will print sum of digit upto given number

package practicequestion;

// import Scanner to take input from user
import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a number to print from 1 to n: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i;
        }
        System.out.println(sum);
        sc.close();
        
    }
}
