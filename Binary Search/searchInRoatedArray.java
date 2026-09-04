
public class searchInRoatedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int T = 0;

        System.out.println(res(nums, T));
    }

    public static int res(int[] nums, int T) {
        int l = 0, r = (nums.length - 1);

        while(l <= r){
            int mid = l + (r-l) /2;

            if(nums[mid] == T) return  mid;

            if(nums[mid] >= nums[l]){

                if(nums[l] <= T && nums[mid] > T){
                    r = mid -1;
                }else{
                    l = mid +1;
                }

            }else{

                if(nums[mid] < T && nums[r] >= T  ){
                    l = mid+1;
                }else{
                    r = mid-1;
                }

            }
        }
       

        return -1;
    }

    public static int search(int[] nums, int l, int r, int T) {
        int mid = l + (r - l) / 2;

        if (nums[mid] == T) {
            return mid;
        }
        if (nums[mid] < T) {
            return search(nums, mid + 1, r, T); 
        }else if (nums[mid] > T) {
            return search(nums, l, mid - 1, T);
        }

        return -1;
    }
}
