
import java.util.Arrays;

/**
 * MaxDistance
 */
public class MaxDistance {

    public static void main(String[] args) {
        int[] position = {1, 100};
        int m = 2;

        System.out.println(res(position, m));

    }

    public static int res(int[] position, int m) {
        Arrays.sort(position);
        int l = 1 ,r = position[position.length-1] - position[0],  res = 0;
       
        while (l <= r) {
            int mid = l + (r - l) / 2;
            System.out.println("Mids :" + mid);
            if (DistributeBalls(position, mid, m)) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return res;
    }

    public static boolean DistributeBalls(int[] position, int force, int m) {

        int prevBasket = position[0], balls = 1;

        for (int i = 1; i < position.length; i++) {
            if (position[i] - prevBasket >= force) {
                balls++;
                prevBasket = position[i];
            }
            if(balls >= m ){
                return  true;
            }
        }

        return false;
    }

}
