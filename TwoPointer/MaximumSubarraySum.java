
import java.util.HashSet;
import java.util.Set;

/**
 * MaximumSubarraySum
 */
public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        
        int k = 3;
        System.out.println(res(nums, k));

    }

    public static int res(int[] nums, int k) {
        int sum = 0, m = 0, j = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            while (set.contains(nums[i])) {

                set.remove(nums[j]);

                m -= nums[j];

                j++;
            }

            set.add(nums[i]);
            m += nums[i];

            while (i-j + 1 > k) {
                set.remove(nums[j]);
                m -= nums[j];
                j++;
            }

            if (i-j + 1 == k) {

                sum = Math.max(sum, m);

            }

        }

        return sum;

    }
}
