
public class FindFloor {

    public static void main(String[] args) {
        int[] nums= {1, 2, 8, 10, 10, 12, 19};
        int x = 5 ;

        System.out.println(res(nums, x));
    }

    public static int res(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}
