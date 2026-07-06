public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums= {3,3,3,3,3};

        System.out.println(res(nums));
    }

    public static int res(int[] nums){

        int[] count = new int[nums.length];

        for(int i : nums){

            if(count[i] == 0){
                count[i] = 1;
            }else {
                return i;
            }

        }

        return -1;
    }
}
