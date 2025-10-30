// it will print maximum of given three number

package practicequestion;

// import Scanner to take input from user
import java.util.Scanner;

public class maxOfThree {

    public static void max(int num, int num1, int num2) {
        int max;
        if (num >= num1 && num >= num2) {
            max = num;
        } else if(num1 >= num2 && num1 >= num){
            max = num1;
        } else {
            max = num2;
        }
        System.out.println("the maximum number is: " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int num = sc.nextInt();

        System.out.print("Enter a Second number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a Thrid number: ");
        int num2 = sc.nextInt();

        max(num, num1, num2);

        sc.close();
    }
}
