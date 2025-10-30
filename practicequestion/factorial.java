// it will print factorial from 1 to given number

package practicequestion;

// import Scanner to take input from user
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int first = 1;
        int next = 0;

        System.out.print("Enter a number to print factorial to n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            next = first *= i;
            
        }
        System.out.println("The factorial upto " + n + " : " + next);
        sc.close();
    }
}
