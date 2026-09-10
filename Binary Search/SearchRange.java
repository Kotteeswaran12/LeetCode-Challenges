

public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int T = 7;

        System.out.println(findFirst(nums, T));
        System.out.println(findLast(nums, T));
    }

    public static int findFirst(int[] nums, int T) {
        int left = 0, rigth = nums.length - 1, first = -1;

        while (left <= rigth) {
            int mid = left + (rigth - left) / 2;

            if (nums[mid] == T) {
                first = mid;
                rigth = mid - 1;
            }

           else if (nums[mid] < T) {
                left = mid + 1;
            } else {
                rigth = mid - 1;
            }
        }

        return first;
    }

    public static int findLast (int[] nums  , int T){
        int l = 0 , r = nums.length-1 , last = -1;
        
          while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == T) {
                last = mid;
                l = mid + 1;
            }

            else if (nums[mid] < T) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return last;
    }
}
