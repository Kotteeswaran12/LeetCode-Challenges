
/**
 * BackspaceCompare
 */
public class BackspaceCompare {

    public static void main(String[] args) {
        String s1 = "a##c";
        String s2 = "#a#c";

        System.out.println(res(s1, s2));

    }

    public static boolean res(String s1, String s2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int s1Len = s1.length() - 1, s2Len = s2.length() - 1;

        while (s1Len >= 0 && s2Len >= 0) {
            int skip = 0;
            while (s1Len >= 0) {

                if (s1.charAt(s1Len) == '#') {
                    skip++;
                    s1Len--;
                } else if (skip > 0) {
                    skip--;
                    s1Len--;
                } else {
                    sb1.append(s1.charAt(s1Len));
                    s1Len--;
                }

            }
            skip = 0;
            while (s2Len >= 0) {

                if (s2.charAt(s2Len) == '#') {
                    skip++;
                    s2Len--;
                } else if (skip > 0) {
                    skip--;
                    s2Len--;
                } else {
                    sb2.append(s2.charAt(s2Len));
                    s2Len--;
                }

            }

        }

        System.out.println(sb1 + " , " + " ," + sb2);

        return sb1.toString().equals(sb2.toString());
    }
}