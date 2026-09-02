
/**
 * MySqrt
 */
public class MySqrt {

    public static void main(String[] args) {
        int x = 8;
        System.out.println(res(x));
    }

    public static int res(int x) {
        if (x < 2) {
            return x;
        }
        long l = 1, r = x/2;

        while (l <= r) {
            long mid = l + (r - l )/2;
            long square = (mid * mid);
            if (square == x) {
                return(int) mid;
            }  if (square < x) {
                l = mid+1;
            } else {
                r = mid -1;
            }
        }

        return (int)r;
    }
}
