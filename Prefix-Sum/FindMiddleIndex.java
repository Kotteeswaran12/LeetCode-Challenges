
import java.util.Arrays;

public class FindMiddleIndex {
    
    public static void main(String[] args) {
        int[] nums ={2,5};

        System.out.println(res(nums));
    }

    public static int res(int[] nums){
        int[] prefizSum = new int[nums.length+1];
       

        for(int i=1; i<=nums.length ; i++){
            prefizSum[i] = prefizSum[i-1] + nums[i-1];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(prefizSum));

        for(int i=1 ; i<prefizSum.length ; i++){
            int leftsum = prefizSum[i-1];
            int rightsum = prefizSum[prefizSum.length-1] - prefizSum[i];

            System.out.println("LSum : "+ leftsum +" , " + "RSum : "+ rightsum);

            if(leftsum == rightsum){
                return i-1;
            }
        }


        return  -1;
    }
}
