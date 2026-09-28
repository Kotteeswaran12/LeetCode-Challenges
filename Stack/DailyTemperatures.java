
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * DailyTemperatures
 */
public class DailyTemperatures {

    public static void main(String[] args) {
        int[] nums = {30,60,90};
        System.out.println(Arrays.toString(res(nums)));
    }

    public static int[] res(int[] nums) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        Stack<Integer> q = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && nums[q.peek()] < nums[i]) {
                int j = q.pop();
                map.put(j, i - j);
            }

            q.push(i);

            System.out.println(q);

            System.out.println(map);
        }

        for (int i = 0; i < n; i++) {
            result[i] = map.getOrDefault(i, 0);
        }

        return result;
    }
}
