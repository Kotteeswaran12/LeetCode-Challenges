
import java.util.Arrays;

public class twoSum {

    public static void main(String[] args) {

        int[] num = {3,24,50,79,88,150,345};
        int T = 200;

        System.out.println(Arrays.toString(res1(num, T)));

    }

    public static int[] res1(int[] num, int T) {

        int[] res = new int[2];
        int i = 0, j = num.length-1;

        while (i < j) {
            System.out.println("i : " + i + " J :" + j);

            if((num[i] + num[j]) > T){
                j--;
            }
            
            else if( (num[i] + num[j]) < T){
                i++;
            }
             if( (num[i] + num[j]) == T){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }

        }

        return res;

    }

}
