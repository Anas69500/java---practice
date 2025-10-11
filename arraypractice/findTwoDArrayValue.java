package arraypractice;
import java.util.*;

public class findTwoDArrayValue {
    public static void main(String[] args) {
        System.out.println("You have to enter first how many rows!!!!!!!. \nThen how many columns!!!!!!!. \nThen there values!!!!!!!. \nThen search value!!!!!!!.\n");

        Scanner sc = new Scanner(System.in);

        //taking row input form user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        //taking row input form user
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        System.out.println();

        //creating an array
        int arr[][] = new int[rows][cols];

        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the Array("+ i + "," + j +") value: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        //taking search value from user
        System.out.print("Enter the search value: ");
        int search = sc.nextInt();

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                //with this condition we find search value in array
               if(arr[i][j] == search) {
                    System.out.println("found search value index number is :("+ i + "," + j + ")");
               }
                
            }
        }
        sc.close();
    }
}


