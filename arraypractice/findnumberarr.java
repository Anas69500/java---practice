package arraypractice;

public class findnumberarr {
    public static void main(String[] args) {
        
        //creating array and assign value to it
        int arr[] = {0, 1, 2, 3, 2, 2};

        //assign search value
        int x = 2;

        //with the help of for loop we search every indexed value in arr
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("found search value index number is :" + i);
            }
        }
    }
}
