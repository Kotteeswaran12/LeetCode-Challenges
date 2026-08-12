
import java.util.Arrays;


public class MatrixBlockSum {

    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int k = 2;

        int[][] ans = res(nums, k);

        for(int[] i : ans){

            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] res(int[][] nums, int k) {
        int row = nums.length;
        int column = nums[0].length;

        int[][] prefixSum = new int[row + 1][column + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {

                prefixSum[i][j] = nums[i - 1][j - 1]  + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];

            }
        }

        int[][] ans = new int[row][column];

        for(int i=0 ; i<row ; i++ ){
            for(int j =0 ; j<column ; j++){

                int r1= Math.max(0 , i-k);
                int c1 = Math.max(0, j-k);
                int r2  = Math.min(row-1, i+k);
                int c2 = Math.min(column-1 , j+k);

                r1++;
                c1++;
                r2++;
                c2++;

                ans[i][j] = prefixSum[r2][c2] - prefixSum[r1-1][c2] - prefixSum[r2][c1-1] + prefixSum[r1-1][c1-1];

            }
        }



        return ans;
    }
}
