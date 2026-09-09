
import java.util.Arrays;



public class Rotate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // System.out.println("Brute Force Approch : " + Arrays.toString(BruteFoceApproch(nums, k)));
        // System.out.println("two pointer Approch : " + Arrays.toString(twoPointerApproch(nums, k)));

        optimiseSolution(nums, 0, nums.length-1);
        optimiseSolution(nums, k, nums.length-1);
        optimiseSolution(nums, 0, k-1);

        System.out.println(Arrays.toString(nums));

    }

    public static int[] BruteFoceApproch(int[] nums, int k) {

        int n = nums.length - 1;

        for (int i = 0; i < k; i++) {
            int temp = nums[n];

            for (int j = n - 1; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }

            nums[0] = temp;
        }

        return nums;
    }

    public static int[] twoPointerApproch(int[] nums, int k) {

        int n = nums.length;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;

            System.out.println(newIndex + " : " + nums[i]);

            res[newIndex] = nums[i];
        }

        return res;

    }

    public static void optimiseSolution(int[] nums, int s, int e) {

        while (s < e) {

            nums[s] = nums[s] + nums[e];
            nums[e] = nums[s] - nums[e];
            nums[s] -= nums[e];

            s++;
            e--;

        }

    }
}
