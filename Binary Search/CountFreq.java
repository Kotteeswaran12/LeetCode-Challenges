public class CountFreq {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 3} ;
        int T = 2;
        System.out.println(res(nums, T));
        
    }

    public static int res(int [] nums , int T){
        int count = 0  , left = 0 , rigth = nums.length-1;

        while(left <= rigth){
            int mid = left + (rigth - left) /2 ;
            if(nums[mid] == T) count++;
            if(nums[mid] < T) left = mid+1;
            else rigth = mid-1;
        }

        

        return  count ;
    }
}
