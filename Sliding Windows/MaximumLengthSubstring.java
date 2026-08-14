
import java.util.HashMap;
import java.util.Map;

public class MaximumLengthSubstring {

    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println("Final : " + res(s));
    }

    public static int res(String s) {
        int ans = Integer.MIN_VALUE, l = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {

            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            System.out.println(map);

            while (map.get(s.charAt(r)) > 2) {

                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);

                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }

                l++;

            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
