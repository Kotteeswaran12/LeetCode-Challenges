
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumSubmatrixSumTarget {

    public static void main(String[] args) {
        int[][] nums = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        int T = 0;

        System.out.println(twoDArray(nums, T));
    }

    public static int twoDArray(int[][] nums, int T) {
        int ans = 0;

        int row = nums.length, column = nums[0].length;

        for (int r = 0; r < row; r++) {
            int[] oneD = new int[column];

            for (int r1 = r; r1 < row; r1++) {
                for (int c = 0; c < column ; c++) {

                    oneD[c] +=  nums[r1][c];

                }

                System.out.println(Arrays.toString(oneD));

                ans += OneDArrays(oneD, T);
            }
        }

        return ans;
    }

    public static int OneDArrays(int[] nums, int T) {
        int prefix = 0, ans = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i : nums) {
            prefix += i;

            int rem = prefix - T;

            if (map.containsKey(rem)) {
                ans += map.get(rem);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);

            System.out.println("prefix" + prefix + map);
        }

        return ans;
    }
}
