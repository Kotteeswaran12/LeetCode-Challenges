
import java.util.ArrayList;
import java.util.List;

public class Permute {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println(res(nums));
    }

    public static List<List<Integer>> res(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        back(new ArrayList<>(), res, nums , used);

        return res;
    }

    public static void back(List<Integer> list, List<List<Integer>> result, int[] nums ,  boolean[] used) {

        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            list.add(nums[i]);
            used[i] = true;

            back(list, result, nums , used);

            list.remove(Integer.valueOf(nums[i]));
            used[i] = false;
        }

    }
}
