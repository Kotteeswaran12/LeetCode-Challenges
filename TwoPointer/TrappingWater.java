public class TrappingWater {
    
    public static void main(String[] args) {
        
        int[] nums= {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(res(nums));

    }

    public static int res(int[] nums){

        int water = 0;
        int left = 0 , right = nums.length-1;
        int leftMax = nums[left] , rightMax =nums[right];

        while(left < right){

            if(nums[left] < nums[right]){

                left++;
                leftMax = Math.max(leftMax, nums[left]);
                
                water += leftMax - nums[left]  ;
                
            }else {

                right -- ;

                rightMax  = Math.max(rightMax, nums[right]);

                water += rightMax - nums[right];

            }


        }


        return  water;
    }
}
