
import java.util.HashMap;

public class SubarraysWithKDistinct {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};

        int k = 2;

        System.out.println("K :" + k + " : " + res(nums, k));
        System.out.println("K :" + (k - 1) + " : " + res(nums, k - 1));

        System.out.println(res(nums, k) - res(nums, k - 1));
    }

    public static int res(int[] nums, int k) {
        int res = 0;

        int l = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }

                l++;
            }

            res += right - l + 1;
        }

        return res;
    }
}
