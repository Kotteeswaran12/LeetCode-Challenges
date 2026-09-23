
public class SearchMatrix {

    public static void main(String[] args) {
        int[][] nums = {{1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
        };
        int target = 13;

        System.out.println(res(nums, target));
    }

    public static boolean res(int[][] nums, int target) {

        int m = nums.length;
        int n = nums[0].length;

        int low = 0, high = m - 1, row = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid][0] <= target && nums[mid][n - 1] >= target) {
                row = mid;
                break;
            } else if (nums[mid][0] > target) {
                high = mid - 1;
            } else if (nums[mid][0] < target) {
                low = mid + 1;
            }

        }

        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[row][mid] == target) {
                return true;
            } else if (nums[row][mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}
