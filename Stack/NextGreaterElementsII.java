
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * NextGreaterElementsII
 */
public class NextGreaterElementsII {

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(res(nums)));
    }

    public static int[] res(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < 2 * n; i++) {

            while (!d.isEmpty() && nums[d.peek() % n] < nums[i % n]) {
                res[d.pop()] = nums[i % n];
            }

            if (i < n) {
                d.addFirst(i % n);
            }
        }

        return res;
    }
}
