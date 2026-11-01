import java.util.Arrays;

public class SmallestSubsequence {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(res(s));

    }

    public static String res(String s) {
        int index[] = new int[26];
        boolean visited[] = new boolean[26];
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            index[c - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (visited[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && index[stack.charAt(stack.length() - 1) - 'a'] > i
                    && stack.charAt(stack.length() - 1) > c) {

                visited[stack.charAt(stack.length() - 1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            System.out.println(c + " " + (int) (c - 'a'));
            stack.append(c);
            visited[stack.charAt(stack.length() - 1) - 'a'] = true;
        }

        System.out.println(Arrays.toString(visited));
        System.out.println(Arrays.toString(index));

        return stack.toString();
    }
}
