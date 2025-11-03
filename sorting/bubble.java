package sorting;

public class bubble {
    public static void bubble(int[] arr){
        
        //bubble sort
        for (int i = 0; i < arr.length-1; i++) {//leaving last digit of an array like n-1 and use in reduce element in next for loop
            
            for (int j = 0; j < arr.length-i-1; j++) {//this loop will run upto one large number swap to end 

                if (arr[j] > arr[j+1]) {//check if first value is greater than second value it will swap both value
                    
                    //swap              
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 2, 1, 3};
        
        bubble(arr);
    }
}
