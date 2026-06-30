public class MaxArea {
    public static void main(String[] args) {
        int[] nums ={1,8,6,2,5,4,8,3,7};
        System.out.println(res(nums));
    }

    public static int res(int[] nums){

        int l= 0 , h = nums.length-1 ;

        int res = 0;
        
        while( l < h){

            System.out.println("Res : "+ res);

            if(nums[l] < nums[h]){

                res = Math.max(res, (h-l) * nums[l++]);

            }else {
                res = Math.max(res, (h-l) * nums[h--]);
            }

        }

        return res ;

    }
}
