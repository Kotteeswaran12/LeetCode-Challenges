
import java.util.Stack;

public class ScoreOfParentheses {

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(res(s));
    }

    public static int res(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();

                if (s.charAt(i - 1) == '(') {
                    res += Math.pow(2, stack.size());
                }

            }

        }

        return res;
    }
}
