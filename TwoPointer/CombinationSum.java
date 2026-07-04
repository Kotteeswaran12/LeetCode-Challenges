
import java.util.ArrayList;
import java.util.List;

public class CombinationSum  {

    public static void main(String[] args) {
        int[] nums = {8,7,4,3} ; int T = 11;
       CombinationSum combinationSum = new CombinationSum();

       System.out.println(combinationSum.res(nums, T));
    }

    public   List<List<Integer>> res(int[] nums , int T){

        List<List<Integer>> res = new ArrayList<>() ;

        back(nums , T ,0 , new ArrayList<>() , res);

        return  res;

    }

    private void back(int[] nums, int T, int s, List<Integer> arrayList, List<List<Integer>> res) {
        
        if( T == 0){
            res.add(new ArrayList<>(arrayList));
            return;
        }

        for(int i=s ; i< nums.length ; i++){

            if(nums[i] > T){
                return;
            }

            arrayList.add(nums[i]);

            back(nums, T-nums[i], i, arrayList, res);
            arrayList.remove(arrayList.size()-1);

        }
    }
}