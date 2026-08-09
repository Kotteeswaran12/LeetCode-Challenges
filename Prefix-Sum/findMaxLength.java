
import java.util.HashMap;
import java.util.Map;

public class findMaxLength {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(res(nums));
    }

    public static int res(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i] == 0 ? -1 : 1;

            if (prefixSum.containsKey(sum)) {
                ans = Math.max(ans, i - prefixSum.get(sum));
            } else {
                prefixSum.put(sum, i);
            }
        }

        System.out.println(prefixSum);

        return ans;
    }
}
