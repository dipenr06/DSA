
public class insertionSort {  

    public static void insertSort(int[] arr) {
    	
        int n = arr.length;
        for(int i = 1; i<n; i++)
        {
            // insert element in sorted portion
            
            int j = i-1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            // position will be j+1
            arr[j+1] = temp;
        }
    }

}