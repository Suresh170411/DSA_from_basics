package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NXG_leetcode {
    public static void main(String[] args) {
        int arr1[] = {4,1,2};
        int arr2[] = {1,3,4,2};

        nextGreaterElement(arr1, arr2);
    }

    public static void nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;

        Stack<Integer> stack = new Stack<>();

        int res [] = new int [n];

        for (int i=n-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                res[i] = -1;
            }else {
                res[i] = stack.peek();
            }
            stack.push(nums2[i]);
        }

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i<n; i++){
            hm.put(nums2[i], res[i]);
        }

        int result [] = new int [nums1.length];
        
        for (int i=0; i<nums1.length; i++){
            result[i] = hm.get(nums1[i]);
        }

        // System.out.println(hm);
        System.out.println(Arrays.toString(result));
    }
}
