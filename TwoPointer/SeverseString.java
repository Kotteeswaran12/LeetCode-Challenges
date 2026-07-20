import java.util.Arrays;

public class SeverseString {

    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a' , 'h'};
        res(s);
        System.out.println(Arrays.toString(s));
    }

    public static void res(char[] s) {

        int i = 0, j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

    }
}
