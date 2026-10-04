
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        int[] nums = {5, 10, -5};

        System.out.println(Arrays.toString(Res(nums)));
    }

    public static int[] Res(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && (stack.peek() < 0 && nums[i] > 0) && (-stack.peek() < nums[i])) {
                stack.pop();
            }

            if (!stack.isEmpty() && (nums[i] > 0 && stack.peek() < 0)) {

                if (-stack.peek() == nums[i]) {
                    stack.pop();
                }

            } else {
                stack.push(nums[i]);
            }

        }

        int res[] = new int[stack.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }

        return res;

    }
}
