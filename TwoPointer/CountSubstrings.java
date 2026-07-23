
public class CountSubstrings {

    static int count = 0;
    public static void main(String[] args) {

        String s = "aba";
        System.out.println(res(s));
        // System.out.println(help(s, 0, s.length() - 1));

    }

    public static int res(String s) {

        

        for (int l = 0; l < s.length(); l++) {

            help(s, l, l);
            help(s, l, l+1);

        }

        return count;
    }

    public static void help(String s, int L, int R) {

        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            count++;
            L--;
            R++;
        }

        
    }
}
