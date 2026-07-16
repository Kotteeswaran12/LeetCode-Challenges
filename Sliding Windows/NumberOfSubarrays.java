
/**
 * NumberOfSubarrays
 */
public class NumberOfSubarrays {

    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;

        System.out.println(res(nums, k) - res(nums, k -1 ));
    }

    public static int res(int[] nums, int k) {
        int count = 0;
        int left =0 , odd = 0;
       for (int right = 0; right < nums.length; right++) {

        if (nums[right] % 2 != 0)
            odd++;

        while (odd > k) {

            if (nums[left] % 2 != 0)
                odd--;

            left++;
        }

        count += right - left + 1;
    }

        return count;
    }
}
