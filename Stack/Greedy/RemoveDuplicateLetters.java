import java.util.Arrays;

/**
 * RemoveDuplicateLetters
 */
public class RemoveDuplicateLetters {

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(res(s));
    }

    public static String res(String s) {
        int index[] = new int[26];
        boolean visited[] = new boolean[26];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            index[c - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (visited[c - 'a']) {
                continue;
            }
            while (!builder.isEmpty() && builder.charAt(builder.length() - 1) > c
                    && index[builder.charAt(builder.length() - 1) - 'a'] > i) {

                visited[builder.charAt(builder.length() - 1) - 'a'] = false;
                builder.deleteCharAt(builder.length() - 1);
            }

            builder.append(c);
            visited[builder.charAt(builder.length() - 1) - 'a'] = true;

        }

        System.out.println(Arrays.toString(index));

        return builder.toString();
    }
}