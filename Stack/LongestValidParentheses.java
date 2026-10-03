
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = ")(";
        System.out.println(res(s));   
    }

    public static int res(String s){

        int n = s.length();
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else {
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    res = Math.max(res, stack.peek());
                }
            }
        }
        return  res;
    }
}
