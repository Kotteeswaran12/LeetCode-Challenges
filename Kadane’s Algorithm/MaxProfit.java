
import java.util.Arrays;

public class MaxProfit {

    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};

        System.out.println(res(nums));
    }

    public static int res(int[] nums) {
        int[] profits = new int[nums.length-1];
        int maxProfix = 0;

        

        for (int i = 1; i < nums.length; i++) {
            profits[i-1] = nums[i] - nums[i-1];
        }

        System.out.println(Arrays.toString(profits));

        int currentProfit = 0;

        for (int i : profits) {
            currentProfit += i;

            currentProfit = currentProfit < 0 ? 0 : currentProfit;

            maxProfix = Math.max(maxProfix, currentProfit);
        }

        return maxProfix;
    }
}
