package sorting;

public class insertion {
    public static void main(String[] args) {
        int arr[] = {5,3,1,4,2};
        
        //insertion sort
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i]; //assign arr[i] value to to current variable

            int j = i-1; // this variable is use to track sorted part in array

            while (j >= 0 && current < arr[j]) {// checking j greater than to 0 and checking current variable less than to arr[j]
                arr[j+1] = arr[j];//and assign arr[j] value to arr[j+1]
                j--;// and decresing j value -1 with post decrement
            }

            arr[j+1] = current;//and assign current value to arr[j+1]
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
