
import java.util.Arrays;

public class checkInclusion {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(res(s1, s2));
    }

    public static boolean res(String s1, String s2) {

        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }

        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        System.out.println(Arrays.equals(c1, c2));

        System.out.println("After !!");
        for (int i = s1.length(); i < s2.length(); i++) {
            c2[s2.charAt(i) - 'a']++;
            c2[s2.charAt(i - s1.length()) - 'a']--;
            System.out.println(Arrays.toString(c2));
            if (Arrays.equals(c1, c2)) {
                return true;
            }
        }
        return false;
    }
}
