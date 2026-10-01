
import java.util.Stack;

public class StockSpanner {

    Stack<int[]> s = new Stack<>();

    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();

        System.out.println(spanner.next(100) );  // return 1
        spanner.next(80);  // return 1
        spanner.next(60);  // return 1
        spanner.next(70);  // return 2
        spanner.next(60);  // return 1
        spanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        spanner.next(85);  // return 6

    }

    public int next(int price) {
        int res = 1;

        while (!s.isEmpty() && s.peek()[0] <= price) {
            res += s.pop()[1];
        }

        s.push(new int[]{price, res});
        return res;
    }
}
