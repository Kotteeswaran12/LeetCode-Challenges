public class MinLength {
    public static void main(String[] args) {
        String s = "ABFCACDB";

        System.out.println(res(s));

    }

    public static int res(String s) {
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {

            int len = builder.length();

            if (len == 0) {
                builder.append(c);
                continue;
            }

            if (c == 'B' && builder.charAt(len - 1) == 'A') {
                builder.deleteCharAt(len - 1);

            } else if (c == 'D' && builder.charAt(len - 1) == 'C') {
                builder.deleteCharAt(len - 1);

            } else {

                builder.append(c);
            }

        }

        System.out.println(builder.toString());

        return builder.length();
    }
}
