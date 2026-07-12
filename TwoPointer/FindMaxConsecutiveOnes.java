public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};

        System.out.println(res(nums));
    }

    public static int res(int[] nums){
        int count =0;

        int i=0 , j =0;

        while(i<=j && j<nums.length){
            
            while(j<nums.length && nums[i] == 1 && nums[j] == 1 ){
                j++;
            }


            count = Math.max(count, ((j-1)-i)+1);

            i = j+1;
            j=i;

        }

        return count;
    }
}