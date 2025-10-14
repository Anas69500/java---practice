package stringpractice;
//importing Scanner package
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //taking input from user
        System.out.print("Enter your Full name: ");
        String name = sc.nextLine();

        //getting string length with the 'length()'
        System.out.println(name.length());

        //create loop for check less than name.length and run inside statement
        for (int i = 0; i < name.length(); i++) {
            
            //charAt function help to print character which match i value in String  
            System.out.println(name.charAt(i));
        }
        sc.close();
    }
    
}
