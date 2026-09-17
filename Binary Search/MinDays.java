/**
 * MinDays
 */
public class MinDays {

    public static void main(String[] args) {
        int[] nums ={1,10,3,10,2};
        int m = 3 , k =1;

        System.out.println(res(nums, m, k));
    }
    public static int res(int[] nums , int m , int k){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int res = 0;
        for(int i : nums){
            low = Math.min(low, i);
            high =Math.max(high, i);
        }

        for(int i = low ; i<= high ; i++){
            int mid = low + (high - low) /2;

            if(makeBouquets(nums, m, k, mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
    public static boolean makeBouquets(int[] nums , int m , int k , int d){
        int count  =0 , b = 0;

        for(int bloom : nums){

            if(bloom <= d){
                count++;
                if(count == k){
                    b++;
                    count=0;
                }
            }else{
                count = 0;
            }
        }

        return b >=m ;
    }
}