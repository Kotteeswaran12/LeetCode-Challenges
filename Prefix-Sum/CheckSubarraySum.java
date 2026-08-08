
import java.util.HashMap;
import java.util.Map;

public class CheckSubarraySum {

    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(res(nums, k));
    }

    public static boolean res(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            int rem = sum % k;

            if (map.containsKey(rem)) {
                System.out.println("prevNum : "+ nums[map.get(rem)]);
                System.out.println("Current num : "+ sum);
                int prevIndex = map.get(rem);
                int diff = i - prevIndex;
                System.out.println("The Diff :" + diff);
                if (diff >= 2) {

                    System.out.println(map);
                    return true;
                }
            }

            map.put(rem, i);
        }
        System.out.println(map);

        return false;
    }
}
