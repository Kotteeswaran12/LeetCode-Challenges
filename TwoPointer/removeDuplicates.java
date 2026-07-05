
import java.util.Arrays;

/**
 * removeDuplicates
 */
public class removeDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3};
        System.out.println(res(nums));

        System.out.println(Arrays.toString(nums) + " Final Num");
    }

    public static int res(int[] nums) {
       int index = 2;

       for(int i =2  ; i<nums.length ; i++){

        System.out.println("Values :" + nums[i] + " : " +nums[index]);
        if(nums[i] != nums[index -2]){
            nums[index] = nums[i];
            index++;
            System.out.println(Arrays.toString(nums));
        }
       }

       return index;
    }
}
