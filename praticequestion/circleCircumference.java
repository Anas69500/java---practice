package praticequestion;

import java.util.Scanner;
public class circleCircumference {
    public static void circumference(double a) {
        double result = 2 * Math.PI * a; 
        System.out.println("the circumference of a circle is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of a circle: ");
        double a = sc.nextDouble();

        circumference(a);
        sc.close();
    }
}
