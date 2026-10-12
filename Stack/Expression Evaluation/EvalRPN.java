
import java.util.Stack;

class EvalRPN {
    public static void main(String[] args) {
        String s[] = { "10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(res(s));
    }

    public static int res(String[] s) {
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (String s1 : s) {

            if (s1.equals("+") || s1.equals("-") || s1.equals("/") || s1.equals("*")) {

                int a = stack.pop(), b = stack.pop();
                System.out.println(a + " , " + b);
                switch (s1) {
                    case "+" -> {
                        stack.push(a + b);

                    }
                    case "-" -> {
                        stack.push(a - b);

                    }
                    case "/" -> {
                        stack.push( b / a);

                    }
                    default -> {
                        stack.push(a * b);

                    }
                }

            } else {
                num = num * 10 + Integer.parseInt(s1);
                stack.push(num);
                num = 0;
            }

        }
        System.out.println(stack);
        return stack.pop();
    }
}