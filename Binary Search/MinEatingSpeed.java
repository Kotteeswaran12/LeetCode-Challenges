
public class MinEatingSpeed {

    public static void main(String[] args) {
        int [] nums = {3,6,7,11} ;
        int h = 8;

        System.out.println(res(nums, h));    
    }

    public static int res(int[] nums, int h) {
        
        int l = 1 , r = 0;
        for(int I : nums){
            r = r< I ? I : r;
        }

        int k = Integer.MAX_VALUE;

        while(l <= r){
            int mid = l + (r-l)/2;

            if(findK(nums, mid, h)){
                k = Math.min(k, mid);
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        

        return k;
    }

    public static boolean findK(int[] nums, int k, int h) {
        long totalHours = 0;
        for(int i : nums){
            if(i % k != 0){
                totalHours += (i / k)+1;
            }else {
                totalHours += i / k;
            }
        }


        return totalHours <= h ? true : false;
    }
}
