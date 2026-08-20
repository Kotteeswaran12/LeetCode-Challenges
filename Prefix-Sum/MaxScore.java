
import java.util.Arrays;

public class MaxScore {

    public static void main(String[] args) {

        String s = "00";
        System.out.println(res(s));

    }

    public static int res(String s) {
        int maxSum = Integer.MIN_VALUE;

        int[] onePrefix = new int[s.length() + 1];
        int[] zeroPrefix = new int[s.length() + 1];
        onePrefix[0] = 0;
        zeroPrefix[0] = 0;

        for (int i = 1; i <= s.length(); i++) {
            if (s.charAt(i - 1) == '1') {
                onePrefix[i] = onePrefix[i - 1] + 1;
                zeroPrefix[i] = zeroPrefix[i-1] + 0;
            } else {
               onePrefix[i] = onePrefix[i - 1] + 0;
               zeroPrefix[i] = zeroPrefix[i-1] + 1;
            }
        }

        int n = onePrefix.length-1;

        for(int i=1 ; i< n ; i++){
            maxSum = Math.max(maxSum, zeroPrefix[i] + (onePrefix[n] - onePrefix[i]));
        }

        System.out.println(Arrays.toString(zeroPrefix));
        System.out.println(Arrays.toString(onePrefix));

        return maxSum;
    }
}
