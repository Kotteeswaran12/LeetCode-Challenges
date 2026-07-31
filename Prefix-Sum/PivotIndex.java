public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(res(nums));
    }

    public static int res(int[] nums){
        int totalsum = 0;

        for(int i : nums){
            totalsum += i;
        }

        int leftSum = 0;

        for(int i=0 ; i<nums.length ; i++){
            int rightSum = totalsum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
