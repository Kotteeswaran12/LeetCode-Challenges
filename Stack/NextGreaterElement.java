
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class nextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = { 1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(StackApproach(nums1, nums2)));
    }

    public static int[] res(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];
        int index = 0;

        for (int i : nums1) {

            int num = findNextGreaterElement(nums2, i);

            res[index++] = num;

        }

        return res;
    }

    public static int findNextGreaterElement(int[] nums2, int Target) {
        int res = -1;
        boolean flag = false ;
        for (int i = 0; i < nums2.length; i++) {
            if (!flag && nums2[i] == Target) {
                flag = true;  
            }

            if(flag && nums2[i] > Target){
                return  nums2[i];
            }
        }

        return -1;
    }


    public static int[] StackApproach(int[] nums1 , int[] nums2){
        Stack<Integer> stack = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        
        for(int i : nums2){

            while(!stack.isEmpty() && stack.peek() < i){
                map.put(stack.pop(), i);
            }

            stack.push(i);
        }

       for(int i=0 ; i<nums1.length ; i++){
        res[i] = map.getOrDefault(nums1[i], -1);
       }

        return  res ;
    }
}
