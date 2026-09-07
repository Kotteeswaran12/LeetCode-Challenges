public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(res(nums));
    }

    public static int res(int[] nums){
        int MAX_VALUE =0 , left = 0 , rigth = nums.length-1;

        while(left < rigth){
            int mid = left + (rigth - left) /2;
            if(nums[mid] > nums[MAX_VALUE]) MAX_VALUE = mid;

            if(nums[left] < nums[mid]){
                left = mid +1;
            }
            else {
                rigth = mid-1;
            }
        }


        return  MAX_VALUE;
    }
}
