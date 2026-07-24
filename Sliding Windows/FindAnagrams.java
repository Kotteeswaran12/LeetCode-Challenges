
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(res(s, p));
    }

    public static List<Integer> res(String s, String p) {

        List<Integer> list = new ArrayList<>();
        int[] parr = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            parr[c - 'a']++;
        }
        int l = 0;
        for (int r = 0; r < s.length(); r++) {

            window[s.charAt(r) - 'a']++;

            if (r - l + 1 == p.length()) {

                if (Arrays.equals(parr, window)) {

                    list.add(l);
                }

                window[s.charAt(l) - 'a']--;
                l++;
            }

        }

        return list;

    }

    private static boolean help(List<Character> character, String p) {
        // TODO Auto-generated method stub

        for (char C : p.toCharArray()) {

            if (!character.contains(C)) {
                return false;
            }
        }

        return true;
    }
}
