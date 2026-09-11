
public class FindCeil {

    public static void main(String[] args) {

        int[] nums = {1, 2, 8, 10, 11, 12, 19} ;
        int x = 5;

        System.out.println(res(nums, x));
    }

    public static int res(int[] nums, int x) {
        int l = 0, r = nums.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < x) {
                l = mid + 1;
            } else if (nums[mid] >= x) {
                ans = mid;
                r = mid - 1;
            }

        }

        return ans;
    }
}
