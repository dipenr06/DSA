public class linearSearch {
    public static void main(String[] args) {

        int[] nums = {12, 34, 122, 66, 23, 76, 1233, 42};
        int target = 1233;
        int ans = lSearch(nums, target);
        System.out.println(ans);


    }
    // Function for linearSearch
    
    static int lSearch(int[] arr, int target)
    {
        // search in the array return the index if item found
        // otherwise if not found return -1
        if(arr.length == 0)
        {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
//            check for element at every index if it is = target
            int element = arr[index];
            if (element == target)
            {
                return index;
            }

        }
        // if the target not found return -1
        return -1;
    }
}
