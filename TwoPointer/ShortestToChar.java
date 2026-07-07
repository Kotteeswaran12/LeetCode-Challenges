import java.util.Arrays;

public class ShortestToChar {
    public static void main(String[] args) {
        String s ="loveleetcode" ; char c = 'e';
        System.out.println(res1(s, c));
    }

    public static int[] res1(String s , char c){
        String[] string = s.split("e");

        System.out.println(Arrays.toString(string));

        return new int[]{};
    }
}
