package sorting;


public class selection {
    public static void main(String[] args) {
        int [] arr = {5,3,1,4,2};
        int n = arr.length;

        //selection sort
        for (int i = 0; i < n-1; i++) {//this loop will run 4 time and use to take first small value index
            int small = i;

            for (int j = i+1; j < n; j++) {//this loop will run i*4 time
                if (arr[small] > arr[j]) {//check arr[samll] value greater than arr[j] then change small index to j
                    small = j;
                }
            }
            //swap
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp; 
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
