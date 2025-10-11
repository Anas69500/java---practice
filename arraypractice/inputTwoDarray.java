package arraypractice;

//Importing Scanner class
import java.util.Scanner;

public class inputTwoDarray {
    public static void main(String[] args) {

        //Instruction
        System.out.println("You have to enter first how many rows!!!!!!!. \nThen how many columns!!!!!!!. \nThen there values!!!!!!!.\n");

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

        //output
        System.out.println("The array element are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                System.out.print(arr[i][j] + " "); 
                
            }
            System.out.println();
        }
        sc.close();
    }
}
