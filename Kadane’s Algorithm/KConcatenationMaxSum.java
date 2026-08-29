
public class KConcatenationMaxSum {

    public static void main(String[] args) {
        int[] nums = {10000,10000,10000,10000,10000,10000,10000,10000,10000,10000};
        int k = 3;

        System.out.println(res(nums, k));
    }

    public static int res(int[] nums, int k) {
        int kadanes = kadanes(nums);
        int maxSum = 0, totalSum = totalSum(nums);
        int prefix = prefixSum(nums), suffix = sufxSum(nums);

        System.out.println("Kadans : " + kadanes);
        System.out.println("prefix : " + prefix);
        System.out.println("Suffix : " + suffix);
        System.out.println("Total Sum : " + totalSum);

        if (k == 1) {
            return kadanes;
        } else if (k < 1 && totalSum <= 0) {
            return Math.max(kadanes, prefix + suffix);
        } else {
            return Math.max(kadanes, prefix + (k - 2) * totalSum + suffix);
        }

    }

    private static int kadanes(int[] nums) {
        int current = 0, maxSum = Integer.MIN_VALUE;

        for (int i : nums) {
            current += i;
            maxSum = Math.max(maxSum, current);
            current = current > 0 ? current : 0;
        }

        return maxSum;
    }

    private static int prefixSum(int[] nums) {
        int current = 0, maxSum = Integer.MIN_VALUE;

        for (int i : nums) {
            current += i;
            maxSum = Math.max(maxSum, current);

        }
        return maxSum;
    }

    private static int sufxSum(int[] nums) {

        int current = 0, maxSum = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            current += nums[i];

            maxSum = Math.max(maxSum, current);

        }
        return maxSum;
    }

    private static int totalSum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return sum;
    }
}
