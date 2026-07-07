
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CombinationSum2
 */
public class CombinationSum2 {

    public static void main(String[] args) {
     
        int[] nums ={10,1,2,7,6,1,5};
        int T = 8;

        System.out.println(res(nums, T));
    }

    public static List<List<Integer>> res(int[] nums, int T){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>() ;
        solution(nums,0, new ArrayList<>(), T, res);
        return  res;
    }

    public static void solution(int[] nums , int j  , List<Integer> L , int T , List<List<Integer>> res){
        if(T == 0 || j == nums.length ){
            
            res.add(new ArrayList<>(L));
            return  ;
        }
        for(int i=j ; i<nums.length ; i++){

            if(i > j && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > T){
                return;
            }

            L.add(nums[i]);
            solution(nums, i+1, L, T-nums[i], res);
            L.remove(L.size()-1);
        }
    }
}