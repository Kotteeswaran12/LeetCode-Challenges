
public class MinSubArrayLen {

    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int T = 4;

        System.out.println(res(nums, T));
    }

    public static int res(int[] nums, int T) {
        int left = 0, right = 0, sum = 0;
        int res = Integer.MAX_VALUE;

        while (left <= right && right < nums.length) {

            sum += nums[right];

          

            while (sum >= T) {
                res = Math.min(res, (right - left)+1);
                sum -= nums[left++];
            }

            right ++;

        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
