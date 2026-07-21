
public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "aba";

        System.out.println(res(s));
    }

    public static boolean res(String s) {

        int L = 0, R = s.length() - 1;

        while (L <= R) {
            if (s.charAt(L) != s.charAt(R)) {
                return help(s, L + 1, R) || help(s, L, R - 1);
            }

            L++;
            R--;
        }

        return true;
    }

    public static boolean help(String s, int L, int R) {
        while (L <= R) {
            if (s.charAt(L) != s.charAt(R)) {
                return false;
            }

            L++;
            R--;
        }

        return true;
    }
}
