package praticequestion;

import java.util.Scanner;
public class xPowern {
    public static double powerresult(int x, int n) {
        double result = Math.pow(x, n);
        System.out.println("the result of " + x + " raised to the power of " + n + " is: " + result);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking base from user
        System.out.print("Enter base value: ");
        int x = sc.nextInt();

         System.out.print("Enter Power value: ");
        int n = sc.nextInt();

        powerresult(x, n);
        sc.close();
    }
}
