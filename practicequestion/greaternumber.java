package practicequestion;

import java.util.*;
public class greaternumber {
    public static void greater(int a,int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
        
    }

    public static void main(String[] args) {
        System.out.println("takes 2 number and return greater of those two.!!!!!");
        Scanner sc = new Scanner(System.in);
        
        //first user input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        //Second user input
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        //calling function
        greater(a, b);

        //closing sc object
        sc.close();
    }
}
