public class MaxAbsoluteSum {
    public static void main(String[] args) {
        int[] nums = {1,-3,2,3,-4};
        System.out.println(res(nums));
    }

    public static int res(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int s = 0;
        for(int i : nums){
            s += i;

            maxSum = Math.max(maxSum, s);
            minSum = Math.min(minSum, s);
        }

        return  maxSum - minSum;
    }
}
