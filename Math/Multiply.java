
public class Multiply {

    public static void main(String[] args) {
        System.out.println(res("2", "3"));
    }

    public static String res(String s1, String s2) {
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int n = s1.length();
        int n2 = s2.length();
        int[] digits = new int[n + n2];
        for (int i = n - 1; i >= 0; i--) {

            int d1 = s1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = s2.charAt(j) - '0';

                int product = d1 * d2;

                int p = i + j;
                int p2 = i + j + 1;
                int sum = product + digits[p2];

                digits[p2] = sum % 10;
                digits[p] += sum / 10;
            }

        }

        StringBuilder builder = new StringBuilder();
        for (int digit : digits) {
            if (builder.length() == 0 && digit == 0) {
                continue;
            }

            builder.append(digit);
        }

        return builder.toString();
    }

}
