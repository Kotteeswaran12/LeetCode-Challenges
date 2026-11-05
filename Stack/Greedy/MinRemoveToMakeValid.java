/**
 * MinRemoveToMakeValid
 */
public class MinRemoveToMakeValid {

    public static void main(String[] args) {
        String s = "))((";

        System.out.println(res(s));
    }

    public static String res(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                left++;
            }
            if (c == ')') {
                right++;
            }

            if (right > left) {
                right--;
                
            }

            else if (right <= left) {
                sb.append(c);
            }

        }

        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (int i =  sb.length()-1 ; i>=0; i--) {
            char c = sb.charAt(i);

            if (c == ')') {
                balance++;
            } else if (c == '(') {
                if (balance == 0) {
                    continue;
                }
                balance--;
            }

            result.append(c);
        }

        return result.reverse().toString();
    }

}