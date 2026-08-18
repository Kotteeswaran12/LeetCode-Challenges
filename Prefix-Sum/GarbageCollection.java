
public class GarbageCollection {

    public static void main(String[] args) {
        String[] g = {"G", "P", "GP", "GG"};
        int[] t = {2, 4, 3};

        System.out.println(res(g, t));

    }

    public static int res(String[] garbage, int[] t) {
        int m = 0, p = 0, g = 0, Lm = 0, Lp = 0, Lg = 0;

        int[] prefixT = new int[t.length + 1];
        prefixT[0] = 0;
        for (int i = 1; i <= t.length; i++) {

            prefixT[i] = t[i - 1] + prefixT[i - 1];
        }

        for (int i = 0; i < garbage.length; i++) {

            for (char c : garbage[i].toCharArray()) {

                switch (c) {
                    case 'G' -> {
                        g++;
                        Lg = i;
                    }
                    case 'P' -> {
                        p++;
                        Lp = i;
                    }
                    default -> {
                        m++;
                        Lm = i;
                    }
                }

            }

        }
        g += prefixT[Lg];
        p += prefixT[Lp];
        m += prefixT[Lm];

        return m + p + g;

    }
}
