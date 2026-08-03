
public class LargestAltitude {

    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,4,3,2};

        System.out.println(res(nums));
    }

    public static int res(int[] nums) {
        int ans = 0;
        int[] arr = new int[nums.length];
        arr[0] = nums[0];

        ans = Math.max(ans, arr[0]);

        for (int i = 1; i < nums.length; i++) {

            arr[i] = arr[i - 1] + nums[i];
            ans = Math.max(ans, arr[i]);
        }

        return ans;
    }
}
