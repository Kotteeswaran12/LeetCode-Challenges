public class FindMin {
    public static void main(String[] args) {
        int[] nums ={11,13,15,17};

        System.out.println(res(nums));
    }

    public static int res(int [] nums){
        int left = 0 , rigth = nums.length-1 , minVal = Integer.MAX_VALUE;

        while( left < rigth){
            int mid = left + (rigth - left)/2;

            System.out.println("mid : "+mid +" val : "+ nums[mid]);

            if(nums[mid] < minVal) minVal = nums[mid];
            
            if(nums[rigth] < nums[mid]){

                left = mid+1 ;

            }else{
                rigth = mid ;
            }

        }

        return  minVal;
    }
}
