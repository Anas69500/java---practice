// it will check the given age is eligbile for vote or not

package practicequestion;

// import Scanner to take input from user
import java.util.Scanner;
public class checkingEligibleForVote {
    public static void Agechecking(int age) {
        if (age >= 18) {
            System.out.println("You'r eligible for vote");
        } else {
            System.out.println("You'r not eligible for vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter you'r age: ");
        int age = sc.nextInt();

        Agechecking(age);
        sc.close();
    }
}
