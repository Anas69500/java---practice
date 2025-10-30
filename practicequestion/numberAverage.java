// it will print average of given three number 

package practicequestion;


// import Scanner to take input from user
import java.util.Scanner;

public class numberAverage {
    public static int average(int a, int b, int c) {
        // double total = ;
        return (a + b + c) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third number: ");
        int c = sc.nextInt();

        // double total = ;
        System.out.println("The Average of three number is: " + average(a, b, c));
        sc.close();
    }
}
