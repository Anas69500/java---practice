package practicequestion;

import java.util.*;

public class oddNumber {
    public static void odd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("sum of odd number from 1 to " + n + " is: " + sum );

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print odd from 1 to n: ");
        int n = sc.nextInt();
        odd(n);
        sc.close();
    }
}