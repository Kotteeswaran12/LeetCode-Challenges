
public class MaxSubarraySumCircular {

    public static void main(String[] args) {
        int[] nums = {-3, -2, -3};
        System.out.println(res(nums));
    }

    public static int res(int[] nums) {
        int totalSum = 0, maxSum = 0, minSum = 0, ans = 0, GlobalMax = Integer.MIN_VALUE, GlobalMin = Integer.MAX_VALUE;

        for (int i : nums) {

            totalSum += i;
            maxSum += i;
            minSum += i;

            GlobalMax = Math.max(GlobalMax, maxSum);

            GlobalMin = Math.min(GlobalMin, minSum);
            minSum = minSum > 0 ? 0 : minSum;
            maxSum = maxSum < 0 ? 0 : maxSum;
        }

        System.out.println("TotalSum :" + totalSum);
        System.out.println("MaxSum : " + maxSum);
        System.out.println("minSum : " + minSum);
        System.out.println("GlobalMax : " + GlobalMax);
        if(totalSum == GlobalMin) return  GlobalMax;
        System.out.println("GlobalMin : " + GlobalMin);
        ans = totalSum - GlobalMin;
        System.out.println("Ans : " + ans);

        return Math.max(ans, GlobalMax);
    }
}
