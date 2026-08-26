
import java.util.HashSet;
import java.util.Set;

public class MissingMultiple {

    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 10, 15};
        int k = 5;
        System.out.println(res(nums, k));
    }

    public static int res(int[] nums, int k) {

       
        int c = k;
        Set<Integer> seen = new HashSet<>();

        for (int i : nums) {
            seen.add(i);

        }

        System.out.println(seen);

        while (seen.contains(c)) {
            c += k;
        }
        return c;
    }
}
