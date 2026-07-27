
import java.util.HashMap;
import java.util.Map;

public class MinWindow {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";

        System.out.println(res(s, t));
    }

    public static String res(String s, String t) {

        String ans = "";
        int formed = 0, requied = 0, l = 0, size = Integer.MAX_VALUE;

        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        System.out.println("The Needs : " + need);
        requied = need.size();

        Map<Character, Integer> window = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {

            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) + 1);

            if (need.containsKey(s.charAt(r)) && window.get(s.charAt(r)).equals(need.get(s.charAt(r)))) {
                formed++;
            }

            while (formed == requied) {
                if (r - l + 1 < size) {
                    size = r - l + 1;
                    ans = s.substring(l, r + 1);
                }

                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);

                if (need.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < need.get(s.charAt(l))) {
                    formed--;
                }

                if (window.get(s.charAt(l)) == 0) {
                    window.remove(s.charAt(l));

                }

                l++;

            }
        }

        return ans;
    }
}
