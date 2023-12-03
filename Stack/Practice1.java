package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Practice1 {
    public static void main(String[] args) {
        int arr [] = {3,2,6,1,9,6};

        nextGreaterElement(arr);
        nextSmallerElement(arr);
    }

    public static void nextGreaterElement(int arr []){
        int n = arr.length;
        int res [] = new int [n];

        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(n-1);

        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void nextSmallerElement(int arr []){
        int n = arr.length;

        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(n-1);

        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }

        System.out.println(Arrays.toString(res));
    }
}
