public class diamond {
    public static void main(String[] args) {
        int n = 5;
        
        //Upper part
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            //braking line
            System.out.println();
        }
        //lower part
        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            //braking line
            System.out.println();
        }
    }
}
