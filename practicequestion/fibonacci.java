package practicequestion;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 1;

        //taking n value from 
        System.out.print("Enter the value to print fibonacci series: ");
        int n = sc.nextInt();

        //
        for (int i = 1; i <= n; i++) {
            System.out.print(first +  " ");

            //add pevious two number
            int next = first + second;

            //updating the value
            first = second;
            second = next;
        }

        sc.close();
    }
}
