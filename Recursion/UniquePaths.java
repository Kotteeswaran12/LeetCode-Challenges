public class UniquePaths {
    public static void main(String[] args) {

        int m =3 , n =7;
        int[][] dp = new int[m][n];
        System.out.println(countPath(m-1, n-1, dp));

    }

    public static int countPath(int m, int n, int[][] dp) {

        if (m == 0 || n == 0) {
            return 1;
        }

        if (dp[m][n] != 0) {
            return dp[m][n];
        }

        dp[m][n] = countPath(m - 1, n, dp) + countPath(m, n - 1, dp);

        return dp[m][n];
    }
}
