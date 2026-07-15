
import java.util.HashMap;

/**
 * TotalFruit
 */
public class TotalFruit {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2};

        System.out.println(res(nums));
    }

    public static int res(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0, r = 0, res = 0;

        while (l <= r && r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > 2) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);

                }
                l++;
            }

            res = Math.max(res, (r - l) + 1);
            r++;
        }

        System.out.println(map);
        return res;
    }
}
