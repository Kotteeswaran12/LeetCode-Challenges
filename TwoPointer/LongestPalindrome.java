


public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "babad";

        System.out.println("Fianl : "+res(s));
    }

    public static String res(String s) {
      
        int end = 0 , start = 0;
        for (int i=0 ; i<s.length() ; i++) {
            int odd= help(s, i, i);
            int even = help(s, i, i+1);
            int Max = Math.max(odd, even);

            if(Max > end - start){
                start = i- (Max-1) /2;
                end = i + Max/2;
            }
            

        }

        return s.substring(start ,end+1);
    }

    public static int help(String s , int L , int R) {
      
    
        while (L >= 0 &&  R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }

        return R-L-1;
    }
}
