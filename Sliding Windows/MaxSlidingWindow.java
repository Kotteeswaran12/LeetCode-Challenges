
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * MaxSlidingWindow
 */
public class MaxSlidingWindow {

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;

        System.out.println(Arrays.toString(res(nums, k)));
    }

    public static int[] res(int[] nums, int k) {

        if (nums.length == 0) {
            return new int[0];
        }

        int[] ans = new int[(nums.length - k) + 1];

        int index = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < nums.length; right++) {

            while( !deque.isEmpty() && deque.peekFirst() < right - k +1){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[right]){
                deque.pollLast();
            }

            deque.offerLast(right);

            if(right >= k - 1 ){
                ans[index++] = nums[deque.peekFirst()];
            }

        }

        return ans;
    }
}
