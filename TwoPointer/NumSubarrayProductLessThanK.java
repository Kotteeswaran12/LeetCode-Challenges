
/**
 * NumSubarrayProductLessThanK
 */
public class NumSubarrayProductLessThanK {

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int K = 100;

        System.out.println(res(nums, K));

    }

    public static int res(int[] nums, int K) {
        int count = 0;
        int i = 0,  product = 1;
        for(int right =0 ; right < nums.length ; right++){
            product *= nums[right];

            while(product >= K){
                product /= nums[i];
                i++;
            }

            count += (right-i)+1;
        }

        return count;

    }
}
