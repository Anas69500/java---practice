package arraypractice;
import java.util.*;

public class arrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking array length from user
        System.out.print("Enter the array length: ");
        int x = sc.nextInt();

        //and assign array length size
        int arr[] = new int[x];

        System.out.println(arr[0]);

        //input
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the array value index[" + i + "] : ");
            
            // We take array index value from user and assign it
            arr[i] = sc.nextInt();
        }

        //output
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
