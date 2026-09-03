public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6} ;
        int t = 7;
        System.out.println(res(nums, t));
    }

    public static int res(int[] nums , int t){
        int l = 0 , r = nums.length-1;

        while( l<r){
            int mid = l + (r-l)/2;
            System.out.println(mid);
            if(nums[mid] == t) return mid;
            else if(nums[mid] < t) l = mid +1;
            else if(nums[mid] > t) r = mid-1;
        }

        System.out.println("l :" + l );
        System.out.println("r : "+ r);
        return  r+2;
    }
}
