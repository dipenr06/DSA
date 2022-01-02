import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {

        int[] nums = {2,4,6,11,15};
        int[] ans = new int[2];
        int target = 10;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j)
                {
                    ans[0] = j;
                    ans[1] = i;
                }

            }

        }
        System.out.println(Arrays.toString(ans));

    }
}
