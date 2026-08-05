
import java.util.HashMap;
import java.util.Map;

public class SubarraysDivByK {

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(res(nums, k));
    }

    public static int res(int[] nums, int k) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int prefixSum = 0;
        for (int i : nums) {

            System.out.println(map);

            prefixSum += i;
            int rem = prefixSum % k ;
            if(rem < 0) rem+= k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;

    }
}
