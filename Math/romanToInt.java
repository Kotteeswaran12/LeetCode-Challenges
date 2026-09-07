
import java.util.HashMap;
import java.util.Map;

public class romanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(res(s));
    }

    public static int res(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int res = 0, preVal = 0;

        for (char C : s.toCharArray()) {


            if (preVal < roman.get(C)) {
                res -= preVal;

                res += (roman.get(C) - preVal);
                preVal = roman.get(C);
            }else {
                res += roman.get(C);
                preVal = roman.get(C);
            }

        }

        return res;
    }
}
