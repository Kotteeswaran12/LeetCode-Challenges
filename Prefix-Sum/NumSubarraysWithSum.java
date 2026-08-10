
import java.util.Arrays;

public class NumSubarraysWithSum {

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(res(nums, goal));
    }

    public static int res(int[] nums, int goal) {
        int ans = 0, sum = 0, n = nums.length;
        int[] count = new int[n + 1];
        count[0]++;

        for (int i : nums) {

            sum += i;
            System.out.println(sum);

            if (sum >= goal) {
                ans += count[sum - goal];
            }

            count[sum]++;
        }
        System.out.println(Arrays.toString(count));
        return ans;
    }

    public static int slidingWindo(int[] nums, int goal) {
        int i = 0, sum = 0, ans = 0;

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];

            System.out.println(sum);

            if (sum == goal) {
                ans++;
            }

            while (i < nums.length && sum > goal) {
                sum -= nums[i];
                if (sum == goal) {
                    ans++;
                }
                i++;
            }

        }

        return ans;
    }
}
