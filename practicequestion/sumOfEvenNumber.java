// it will print sum of even number upto given number

package practicequestion;

// import Scanner to take input from user
import java.util.Scanner;

public class sumOfEvenNumber {
    public static void evennumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i+=2) {
            sum +=i;
            System.out.print(i + " " );
        }
        System.out.println("\nthe sum of even number from 1 to " + n + " is: " + sum);
    }
    public static void main(String[] args) {
        System.out.println("print sum of even number from 1 to n.!!!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        evennumber(n);
        sc.close();
    }
}
