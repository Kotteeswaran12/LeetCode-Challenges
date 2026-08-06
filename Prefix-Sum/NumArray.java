import java.util.Arrays;

public class NumArray {

    private int[] prefix;

    public NumArray(int[] nums) {

        prefix = new int[nums.length +1];

       
        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i ] + nums[i];
        }

    }

    public int res(int l, int r) {
        return l > 0 ?  prefix[r] - prefix[l - 1] :  prefix[r+1] - prefix[l];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray array = new NumArray(nums);

        System.out.println(Arrays.toString(array.prefix));
        System.out.println(array.res(0, 2));

    

    }

}
