
/**
 * MaxProduct
 */
public class MaxProduct {

    public static void main(String[] args) {
        int[] nums = {-3,-1,-1};

        System.out.println(res(nums));
    }

    public static int res(int[] nums) {
        int n = nums.length;
        int maxSum =Integer.MIN_VALUE;
        int prefix = 1, sufix = 1;
        for (int i= 0 ; i<n ; i++ ) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (sufix == 0) {
                sufix = 1;
            }

            prefix *= nums[i];
            sufix *= nums[n - i - 1];

            maxSum = Math.max(maxSum, Math.max(prefix, sufix));
            

        }

        return maxSum;
    }
}
