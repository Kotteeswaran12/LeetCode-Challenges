
/**
 * FourSum
 */
import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        int[] nums= {2,2,2,2,2};
        int T = 8;
        System.out.println(res(nums, T));
    }

    public static List<List<Integer>> res(int[] nums, int T) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int f = 0; f < n - 3; f++) {

            if (f > 0 && nums[f] == nums[f + 1]) {
                continue;
            }

            for (int s = f + 1; s < n - 2; s++) {

                if (s > f + 1 && nums[s] == nums[s - 1]) {
                    continue;
                }
                int t = s + 1;
                int fo = n - 1;

                while (t < fo) {
                    long sum = (long) nums[f] + nums[s] + nums[t] + nums[fo];

                    if (sum == T) {
                        list.add(List.of(nums[f], nums[s], nums[t], nums[fo]));

                        t++;
                        fo--;

                        while (t < fo && nums[t] == nums[t - 1]) {
                            t++;
                        }

                        while (t < fo && nums[fo] == nums[fo + 1]) {
                            fo--;
                        }
                    } else if (sum < T) {
                        t++;
                    } else {
                        fo--;
                    }
                }
            }
        }

        return list;
    }
}
