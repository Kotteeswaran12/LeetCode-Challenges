
import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {

    public static void main(String[] args) {
        char[][] nums = {{'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'}};

        System.out.println(res(nums));
    }

    public static int res(char[][] nums) {
        int row = nums.length;
        int col = nums[0].length;
        int MaxRectangle = 0;

        int[] heigth = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (nums[i][j] == '1') {
                    heigth[j] += 1;
                } else {
                    heigth[j] = 0;
                }
            }

            MaxRectangle = Math.max(MaxRectangle, largestReactangleArea(heigth));
        }

        System.out.println(Arrays.toString(heigth));

        return MaxRectangle;
    }

    public static int largestReactangleArea(int[] heigth) {
        int n = heigth.length;
        Stack<Integer> stack = new Stack<>();
        int MaxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = i == n ? 0 : heigth[i];

            while (!stack.isEmpty() && h < heigth[stack.peek()]) {
                int Heigth = heigth[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = Heigth * width;
                MaxArea = Math.max(MaxArea, area);

            }

            stack.push(i);

        }

        return MaxArea;
    }
}
