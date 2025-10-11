package arraypractice;

public class twoDarray {
    public static void main(String[] args) {
        int twoarr[][] = {{1, 2, 3, 4},{1, 2, 3, 4},{1, 2, 3, 4}}; 

        //print output

        //rows
        for (int i = 0; i < twoarr.length; i++) {
            
            //columns
            for (int j = 0; j < twoarr[i].length; j++) {
                System.out.print(twoarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
