import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 6, 5 };
        int k = 3;
        int[] nums2 = { 9, 1, 2, 5, 8, 3 };

        System.out.println(Arrays.toString(res(nums, k, nums2)));
    }

    public static int[] res(int[] nums1, int k, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] best = new int[k];

        for (int i = Math.max(0, k - n); i <= Math.min(k, m); i++) {
            int[] arr1 = maxArr(nums1, i);
            int[] arr2 = maxArr(nums2, k-i);

            int[] ans = meargeArr(arr1, arr2, k);
            if (isGreater(ans, best)) {
                best = ans;
            }

        }
        return best;
    }

    public static int[] maxArr(int[] nums1, int k) {
        int[] ans = new int[k];
        int n = nums1.length;
        int removed = 0;
        for (int i = 0, j = 0; i < n; i++) {

            while (j > 0 && ans[j - 1] < nums1[i] && (removed <  n - k)) {
                j--;
                removed++;
            }

            if (j < k) {
                ans[j++] = nums1[i];

            }
        }
        return ans;
    }

    public static boolean Greater(int[] nums1, int[] nums2, int i, int j) {
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] != nums2[j]) {
                return nums1[i] > nums2[j];
            }
            i++;
            j++;
        }

        return (nums1.length - i) > (nums2.length - j);
    }

    public static boolean isGreater(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                return a[i] > b[i];
            }

        }
        return false;
    }

    public static int[] meargeArr(int[] nums1, int[] nums2, int k) {
        int res[] = new int[k];

        int i = 0, j = 0;

        for (int p = 0; p < k; p++) {

            if (Greater(nums1, nums2, i, j)) {
                res[p] = nums1[i++];
            } else {
                res[p] = nums2[j++];
            }

        }

        return res;
    }

}
