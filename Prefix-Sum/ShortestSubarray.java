
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ShortestSubarray {

    public static void main(String[] args) {
        int[] nums = {0, 0, 69, 56, -34};
        int k = 91;
        System.out.println(res(nums, k));
    }

    public static int res(int[] nums, int k) {
        int sum = 0, l = 0, ans = Integer.MAX_VALUE;

        int[] prefixsum = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
            prefixsum[i] = nums[i - 1] + prefixsum[i - 1];
        }
        System.out.println(Arrays.toString(prefixsum));

        Deque<Integer> d = new ArrayDeque<>();

        for (int r = 0; r < nums.length; r++) {

            while (!d.isEmpty() && prefixsum[r] - prefixsum[d.peekFirst()] >= k) {
                ans = Math.min(ans, r - d.pollFirst());
            }

            while (!d.isEmpty() && prefixsum[r] <= prefixsum[d.peekLast()]) {
                d.pollLast();
            }

            d.offerLast(r);

        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
