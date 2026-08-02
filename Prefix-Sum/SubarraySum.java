
import java.util.HashMap;
import java.util.Map;


public class SubarraySum {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int T = 3;

        System.out.println(res(nums, T));
    }

    public static int res(int[] nums, int T) {
      Map<Integer , Integer > map = new HashMap<>();
        map.put(0, 1);
      int count =0  , sum = 0;

      for(int i : nums){
        sum += i ; 

        if(map.containsKey(sum - T)){
            count += map.get(sum-T);
        }

        map.put(sum, map.getOrDefault(sum, 0)+1);

      }
    
      return  count;

    }
}
