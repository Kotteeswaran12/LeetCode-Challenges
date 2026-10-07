
import java.util.Stack;

class Calculate {

    public static void main(String[] args) {
        String s = "(2-1) + 2";

        System.out.println(res(s));
    }

    public static int res(String s) {

        Stack<Integer> stack = new Stack<>();
        int res = 0, number = 0, sign = 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                number = number * 10 + (s.charAt(i) - '0');
            } else {
                if (s.charAt(i) == '+') {
                    res +=   sign * number;
                    number = 0;
                    sign = 1;
                } else if (s.charAt(i) == '-') {
                    res +=   sign * number;
                    number = 0;
                    sign = -1;

                } else if (s.charAt(i) == '(') {

                    stack.push(res);
                    stack.push(sign);
                    res = 0;
                    sign = 1;

                } else if (s.charAt(i) == ')') {
                    res += sign * number;
                    number = 0;
                    int PreviousSign = stack.pop();
                    int PrevValue = stack.pop();

                    res =   PrevValue + PreviousSign * res;
                    sign = 1;

                }
            }
        }

        res += sign * number;
        
        return res;
    }
}
