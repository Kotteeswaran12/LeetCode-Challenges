
/**
 * LongestOnes
 */
public class LongestOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int T = 2;

        System.out.println(res(nums, T));

    }

    public static int res(int[] nums, int T) {
        int size = 0;

        int j = 0, zero = 0;
// {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}

        for (int r = 0; r < nums.length; r++) {
            if(nums[r] == 0)
                zero++;

            while(zero > T){
                if(nums[j] ==0)
                    zero--;
                j++;
            }

            size = Math.max(size, (r-j)+1);
        }

        return size;
    }
}
