import java.util.Arrays;

public class Rob {
    static int [] dp;
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        dp =new int[nums.length];
        Arrays.fill(dp, -1);
        System.out.println(robs(nums, 0));
    }

    public static int robs(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int res = nums[i] + robs(nums, i + 2);
        int skip = robs(nums, i + 1);
        dp[i] = Math.max(res, skip);
        return dp[i];

    }
}
