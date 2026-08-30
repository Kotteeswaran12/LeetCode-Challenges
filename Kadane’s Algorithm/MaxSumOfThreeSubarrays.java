
import java.util.Arrays;

public class MaxSumOfThreeSubarrays {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 6, 7, 5, 1};
        int k = 2;

        System.out.println(Arrays.toString(res(nums, k)));
    }

    public static int[] res(int[] nums, int k) {
        int[] ans = new int[3];
        int[] prefix = new int[nums.length - k + 1];
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];

        }
        prefix[0] = currentSum;
        for (int i = 1; i < prefix.length; i++) {
            currentSum = currentSum - nums[i - 1] + nums[i + k - 1];

            prefix[i] = currentSum;
        }
        int[] leftBeat = LeftBest(prefix);
        int[] RightBest = RightBest(prefix);
        int maxTotal = 0;
        for (int mid = k; mid < prefix.length - k; mid++) {
            int left = leftBeat[mid - k];
            int third = RightBest[mid + k];
            int total = prefix[left] + prefix[mid] + prefix[third];

            if (total > maxTotal) {
                maxTotal = total;
                ans[0] = left;
                ans[1] = mid;
                ans[2] = third;
            }

        }

        return ans;
    }

    public static int[] LeftBest(int[] nums) {
        int[] leftBest = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[max] < nums[i]) {
                leftBest[i] = i;
                max = i;
            } else {
                leftBest[i] = max;
            }

        }

        return leftBest;
    }

    public static int[] RightBest(int[] nums) {
        int[] RightBest = new int[nums.length];
        int max = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[max] < nums[i]) {
                RightBest[i] = i;
                max = i;
            } else {
                RightBest[i] = max;
            }

        }

        return RightBest;
    }
}
