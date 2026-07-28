
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findSubstring {

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] W = {"foo", "bar"};

        System.out.println(res(s, W));
    }

    public static List<Integer> res(String s, String[] W) {
        List<Integer> lis = new ArrayList<>();

        if (s == null || s.length() == 0 || W.length == 0) {
            return lis;
        }

        Map<String, Integer> need = new HashMap<>();

        for (String d : W) {

            need.put(d, need.getOrDefault(d, 0) + 1);

        }

        int count = W.length, wordSize = W[0].length();

        for (int offset = 0; offset < wordSize; offset++) {

            int left = offset, matched = 0;

            Map<String, Integer> window = new HashMap<>();

            for (int right = offset; right + wordSize <= s.length(); right += wordSize) {
                String word = s.substring(right, right + wordSize);

                if (!need.containsKey(word)) {
                    window.clear();
                    left = right + wordSize;
                    matched = 0;
                    continue;
                }

                window.put(word, window.getOrDefault(word, 0) + 1);
                matched++;

                while (window.get(word) > need.get(word)) {

                    String lWord = s.substring(left, left + wordSize);

                    window.put(lWord, window.get(lWord) - 1);
                    matched--;
                    left += wordSize;

                }

                if (matched == count) {
                    lis.add(left);
                    String lWord = s.substring(left, left + wordSize);

                    window.put(lWord, window.get(lWord) - 1);
                    matched--;

                    left += wordSize;
                }

            }

        }

        return lis;
    }
}
