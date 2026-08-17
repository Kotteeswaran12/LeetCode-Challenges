public class CountDigitOccurrences {
    public static void main(String[] args) {
        int[] nums = {1,34,7};
        int d= 9;
        System.out.println(res(nums, d));
    }

    public static int res(int[] nums , int d){
        int count = 0;
        for(int i : nums){
            int n = i;
            while(n > 0){
                if(n%10 == d){
                    count++;
                }

                n/= 10;
            }
        }

        return count;
    }
}
