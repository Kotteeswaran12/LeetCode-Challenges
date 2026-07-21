
public class IsPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(res(s));
    }

    public static boolean res(String s) {

        if (s.equals(" ")) {
            return true;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb);

       
        int i = 0, j = sb.length() - 1;

        while (i <= j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        // System.out.println(Arrays.toString(c));
        return true;
    }
}
