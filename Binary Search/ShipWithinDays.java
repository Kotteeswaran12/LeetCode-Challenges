
/**
 * ShipWithinDays
 */
public class ShipWithinDays {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;

        System.out.println(res(nums, D));
    }

    public static int res(int[] nums, int D) {
        int l = 0, r = 0, res = 0;

        for (int i : nums) {

            l = Math.max(l, i);
            r += i;

        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (shipmentCalc(nums, mid, D)) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }

    public static boolean shipmentCalc(int[] nums, int ship, int D) {
        int i = 0, weigth = 0, days = 1;
        while (i < nums.length) {

            if (weigth + nums[i] > ship) {
                weigth = 0;
                days++;
            }
            weigth += nums[i++];

        }

        return days <= D;
    }
}
