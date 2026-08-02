
import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(res1(nums)));
    }

    public static int[] res(int[] nums) {

        int[] ans = new int[nums.length];
        int index = 0, product = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i == j) {
                    continue;
                }

                product *= nums[j];

            }

            ans[index++] = product;
            product = 1;
        }

        return ans;
    }

    public static int[] res1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int l = 1; l < n; l++) {   

            ans[l] = ans[l-1] * nums[l-1];
        }

        int rightPrd = 1;

        for(int r = n-1; r>=0 ; r--){
            ans[r] = ans[r] * rightPrd ;
            rightPrd *= nums[r];
        }

        return ans ;
    }
}
