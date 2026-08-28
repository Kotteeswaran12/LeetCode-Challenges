public class MaximumSum {
    public static void main(String[] args) {
        int[] nums= {-1,-1,-1,-1};

        System.out.println(res(nums));
    }

    public static int res(int[] nums){
        int MaxSum = nums[0] , currentSum = nums[0] , dropSum = 0;
       
        
        for(int i : nums){
            
            dropSum = Math.max(dropSum + i, currentSum);

            currentSum  = Math.max(i , currentSum + i);

            
           
            MaxSum = Math.max(MaxSum,Math.max( currentSum, dropSum));

        }

        return MaxSum;
    }
}
