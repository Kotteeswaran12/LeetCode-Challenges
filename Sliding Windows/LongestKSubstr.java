
import java.util.HashMap;
import java.util.Map;

public class LongestKSubstr {

    public static void main(String[] args) {
        String s = "aabaaab";
        int k = 2;

        System.out.println(res(s, k));
    }

    public static int res(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int res = 0;
        int n = s.length();
        int l = 0;
        for (int r = 0; r < n; r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            res = Math.max(res, r - l + 1);

            while (map.size() > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);

                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }

                l++;
            }

        }

        return map.size() == k? res : -1;

    }
}
