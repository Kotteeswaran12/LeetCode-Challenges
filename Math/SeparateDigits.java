
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateDigits {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        System.out.println(Arrays.toString(res(nums)));
    }

    public static int[] res(int[] nums ){
        List<Integer> lis = new ArrayList<>();
        for(int  I : nums){
            
          String c = String.valueOf(I);

          for(char cc : c.toCharArray()){
            lis.add(cc - '0');
          }
        }
        return lis.stream().mapToInt(Integer :: intValue).toArray();
    }
}
