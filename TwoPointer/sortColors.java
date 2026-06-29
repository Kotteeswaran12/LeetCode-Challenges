import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * sortColors
 */
public class sortColors {

    public static void main(String[] args) {
        
        int[] nums = {2,0,2,1,1,0};

        System.out.println(Arrays.toString(approch2(nums)));
    }

    public static int[] res1(int[] nums){

        int zero = 0 , one = 0 , two = 0 ;
        for(int i=0  ; i<nums.length ; i++){

            if(nums[i] == 0){
                zero++;
            }else if(nums[i] == 1) {
                one++;
            }else {
                two++;
            }
        }
        int index = 0;
        while(zero != 0){
            nums[index++] = 0;
            zero--;
        }
        while(one != 0){
            nums[index++] = 1;
            one--;
        }
        while(two != 0){
            nums[index++] = 2;
            two--;
        }
        return nums ;
    }
    public static int[] approch2(int[] nums){
        int n = nums.length ;
        int l = 0 , m=l , h= n-1;

        while(m <= h){
            if(nums[m] == 0){
                nums[m] = nums[l];
                nums[l] = 0;
                l++ ; m++;
            }
            else if(nums[m] == 1){
                m++;
            }else {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
        return nums;
    }
}