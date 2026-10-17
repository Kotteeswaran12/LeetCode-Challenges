class RemoveDuplicates {

    public static void main(String[] args) {
        String s = "abbaca";

        System.out.println(res(s));
    }

    public static String res(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int len = builder.length();

            if ((len > 0 && builder.charAt(len - 1) == s.charAt(i))) {
                builder.deleteCharAt(len - 1);

            } else {
                builder.append(s.charAt(i));
            }

        }

        return builder.toString();
    }
}