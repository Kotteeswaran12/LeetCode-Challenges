
import java.util.Stack;

public class IsValid {

    public static void main(String[] args) {
        String s = "([])";
        System.out.println(res(s));
    }

    public static boolean res(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (!stack.isEmpty()) {
                if (stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                    continue;
                }
                if (stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                    continue;
                }
                if (stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                    continue;
                }
            }

            stack.push(s.charAt(i));

        }
        System.out.println(stack);
        return stack.isEmpty();
    }
}
