public class SearchMatrixII {
    public static void main(String[] args) {
        int[][] nums ={{1,4,7,11,15} , {2,5,8,12,19} , {3,6,9,16,22} , {10,13,14,17,24}};
        int target = 107;

        System.out.println(res(nums, target));
    }
    public static boolean res(int[][] nums , int target){

        int m = nums.length;
        int n = nums[0].length;

        int r = 0 , c = n-1;

        while(r < m && c >= 0){

            if(nums[r][c] == target){
                return  true;
            }else if (nums[r][c] > target){
                c--;
            }else {
                r++;
            }

        }

        return false ;
    }
}
