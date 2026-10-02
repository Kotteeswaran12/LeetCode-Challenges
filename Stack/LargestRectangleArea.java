
import java.util.Stack;

/**
 * LargestRectangleArea
 */
public class LargestRectangleArea {

    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        System.out.println(res(height));
    }

    public static int res(int[] Height){
        int maxArea = 0;
        int n = Height.length;
        Stack<Integer> stack = new Stack<>();

        for(int i =0 ; i<=n ; i++){
            int h =  i==n ? 0 : Height[i];

            while(!stack.isEmpty() && Height[stack.peek()] > h){
                int height = Height[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() -1;

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }
}