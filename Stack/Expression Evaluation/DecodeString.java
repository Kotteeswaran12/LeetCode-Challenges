
import java.util.Stack;

/**
 * DecodeString
 */
public class DecodeString {

    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(res(s));
        String eiop = "abcabccdcdcdef";
        System.out.println("IOP : " + eiop.equals(res(s)));
    }

    public static String res(String s) {

        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = (num * 10) + (c - '0');

            } else {

                if (c == '[') {
                    intStack.push(num);
                    num = 0;
                    strStack.push(Character.toString(c));
                }
                else if (c != ']') {
                    strStack.push(Character.toString(c));
                } else {

                    String temp = "";
                    int n = intStack.pop();
                    while (!strStack.isEmpty() && !strStack.peek().equals("[")) {
                        temp = strStack.pop() + temp;
                    }
                    strStack.pop();
                    StringBuilder builder = new StringBuilder();
                    for (int i = 1; i <= n; i++) {
                        builder.append(temp);
                    }

                    strStack.push(builder.toString());
                }
            }

        }

        String ans = "";
        while (!strStack.isEmpty()) {
            ans += strStack.removeFirst();
        }

        return ans;
    }
}