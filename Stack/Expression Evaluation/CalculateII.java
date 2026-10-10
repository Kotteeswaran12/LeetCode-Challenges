
import java.util.Stack;

public class CalculateII {
    public static void main(String[] args) {
        String s = "2-1*3";

        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        char sign = '+';
        int number = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }

            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {

                switch (sign) {
                    case '+' -> stack.push(number);
                    case '-' -> stack.push(-number);
                    case '*' -> stack.push(stack.pop() * number);
                    case '/' -> stack.push(stack.pop() / number);
                }
                
                sign = c;
                number = 0;

            }

            System.out.println(stack);
        }

        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }

        return res;
    }
}
