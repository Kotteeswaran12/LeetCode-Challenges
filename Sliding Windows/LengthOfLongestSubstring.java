
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(res(s));
    }

    public static int res(String s) {
        int res = 0, l = 0;
        char[] c = new char[26];

        for (int r = 0; r < s.length(); r++) {

            while (c[s.charAt(r) - 'a'] > 0) {
                c[s.charAt(l) - 'a']--;
                l++;
            }
            // System.out.println(Arrays.toString(c));

            c[s.charAt(r) - 'a']++;

            res = Math.max(res, r - l + 1);

        }

        return res;
    }
}
