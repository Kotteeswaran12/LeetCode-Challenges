
/**
 * Search
 */
public class Search {

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 5, 9, 12};
        int k = 10;
        System.out.println(res(nums, k));
    }

    public static int res(int[] nums, int k) {
        int starting = 0, end = nums.length - 1;

        return recursive(nums, starting, end, k);
    }

    public static int recursive(int[] nums, int starting, int end, int target) {

        if (starting > end) {
            return -1;
        }

        int mid = (starting + end) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            return recursive(nums, mid + 1, end, target);
        } else {
            return recursive(nums, starting, mid - 1, target);
        }

    }
}
