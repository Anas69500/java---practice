package practicequestion;

import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args) {
        //taking user input
        Scanner sc = new Scanner(System.in);

        int ZeroCount = 0; 
        
        int negativeCount = 0;

        int positiveCount = 0;
        
        while (true) {
            try {
                System.out.println("\nWrite symbol and alphabet for exit and display count values. !!!!!!!!");
                System.out.print("Enter the value:");
                int value = sc.nextInt();

            //counting values
             if (value < 0) {
                negativeCount++;
            } else if (value > 0 ){
                positiveCount++;
            } else if (value == 0){
                ZeroCount++;
            } 

            
            } catch (Exception e) {
                System.out.println("exit and display count values zeros: " + ZeroCount + " positive values: " + positiveCount + " negative values: " + negativeCount);
                 sc.close();
                 break;
            }
        }
    }
}
