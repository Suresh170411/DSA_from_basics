package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int arr [] = {1,3,89,10};

        nextGreaterElement(arr);
        NGE(arr);
    }

    public static void nextGreaterElement(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(n-1);

        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void NGE(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            res[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
