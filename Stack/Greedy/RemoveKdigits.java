public class RemoveKdigits {
    public static void main(String[] args) {
        String num = "33526221184202197273";
        int k = 19;
        System.out.println(res(num, k));
    }

    public static String res(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (char i : s.toCharArray()) {
            
            while (sb.length() > 0 && k > 0 && s.charAt(sb.length()-1) > i) {
                sb.deleteCharAt(sb.length()-1);
                k--;
            }

            sb.append(i);
        }

        sb.setLength(sb.length() - k);
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        String ans = sb.substring(i);

        return ans.isEmpty() ? "0" : ans;
    }
}
