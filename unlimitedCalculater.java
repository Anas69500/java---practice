//importing Scanner package!
import java.util.Scanner;

public class unlimitedCalculater {
    
    public static void main(String[] args) {
        //creating sc object from Scanner Class!
        Scanner sc = new Scanner(System.in);

        System.out.println("This calculater will unlimited input value take from user and calculated it.!!!!!!!!!!");
        System.out.println("-----Calculater Menu-----\n");
        System.out.println("Enter ' 1 ' for Addition");
        System.out.println("Enter ' 2 ' for Subtraction");
        System.out.println("Enter ' 3 ' for Multiplication");
        System.out.println("Enter ' 4 ' for Division");
        System.out.println("Enter ' 5 ' for Result.");
        System.out.println("Enter ' 6 ' for Quit.");

        double cal = 0;

        //Running while loop until it break by user!
        while (true) {
            
            //
            System.out.print("Enter the operation to perform: ");
            int op = sc.nextInt();

            if( op == 6){
                System.out.println("Quit");
                break;
            } else if (op == 5){
                System.out.println("Result is: " + cal + "\n thankyou for using calculater! \n\t !!visit Again!!");
            }

            //taking input from user
            System.out.print("Enter the First value: ");
            long a = sc.nextLong();


            //this condition check if user enter stop in op it will break loop! 
            
            double val = a;

           if (op == 1) {
            cal = a + val;

           } else if(op == 2){
            cal = a - val;

           }else if(op == 3){
            cal = val * a;

           }else if(op == 4){
            cal = a / val;

           }else if(op == 5){
            System.out.println("Result is: " + cal + "\n thankyou for using calculater! \t !!visit Again!!");
           } 
        }
        
    }
}
