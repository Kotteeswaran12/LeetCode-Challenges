
public class SplitArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        System.out.println(res(nums, k));
    }

    public static int res(int[] nums, int k) {
        int low = 0, heigh = 0;

        for (int i : nums) {
            low = Math.max(low, i);
            heigh += i;
        }
        int ans = heigh;

        while (low <= heigh) {
            int mid = low + (heigh - low) / 2;

            if (SplitNum(nums, k, mid)) {
                ans = mid;
                heigh = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean SplitNum(int[] nums, int k, int maxVal) {
        int count = 1;
        int sum = 0;

        for (int i : nums) {
            if (sum + i <= maxVal) {
                sum += i;
            } else {
                count++;
                sum = i;
            }
        }

        return count <= k;
    }

}
