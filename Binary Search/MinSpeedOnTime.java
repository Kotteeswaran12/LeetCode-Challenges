
/**
 * MinSpeedOnTime
 */
public class MinSpeedOnTime {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        double h = 2.7;
        // System.out.println((double)1/3);
        System.out.println(res(nums, h));
    }

    public static int res(int[] nums, double h) {
        int l = 1, r = Integer.MAX_VALUE, res = -1;

        for (int i : nums) {
            r = r < i ? i : r;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (calcHours(nums, mid, h)) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }

    public static boolean calcHours(int[] nums, int speed, double h) {
        double hourTraveled = 0;
        for (int i =0 ; i< nums.length ; i++) {
            double hour = (double) nums[i] / speed;
            System.out.println(nums[i] + "/" + speed + " = " + hour);
            hourTraveled += hour;

            if (hourTraveled > h) {
                break;
            }
            if(i != nums.length-1){
                hourTraveled = Math.ceil(hourTraveled);
            }

        }
        System.out.println(hourTraveled);

        return hourTraveled <= h;
    }
}
