
import java.util.Stack;

class MinAddToMakeValid {

    public static void main(String[] args) {
        String s = "(((";
        System.out.println(res(s));
    }

    public static int res(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
                continue;
            }

            stack.push(s.charAt(i));
        }

        return stack.size();
    }
}
