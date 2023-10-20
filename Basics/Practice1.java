package Basics;

import java.util.Arrays;
import java.util.Stack;

public class Practice1 {
    public static void main(String[] args) {
        int arr [] = {1,2,10,0,5,0,2,0,45};

        moveZeroesToRight(arr);
        moveZeroesToLeft(arr);

        int stackArr [] = {6,4,10,8,3,2};

        // nextGreaterElementLeft(stackArr);
        // nextGreaterElementRight(stackArr);
        // nextSmallerElementToRight(stackArr);
        nextSmallerElementToLeft(stackArr);
    }

    public static void moveZeroesToRight(int arr []){
        int n = arr.length;
        int index = 0;
        for (int i=0; i<n; i++){
            if (arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while (index < n){
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToLeft(int arr []){
        int n = arr.length;
        int index = n-1;

        for (int i=n-1; i>=0; i--){
            if (arr[i] != 0){
                arr[index--] = arr[i];
            }
        }
        
        while (index >= 0){
            arr[index--] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void nextGreaterElementLeft(int arr []){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int res [] = new int [n];

        res[0] = -1;
        st.push(0);

        for (int i=1; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }

            if (!st.isEmpty()){
                res[i] = arr[st.peek()];
            }else {
                res[i] = -1;
            }
            
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void nextGreaterElementRight(int arr []){
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

    public static void nextSmallerElementToRight(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(n-1);

        for (int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void nextSmallerElementToLeft(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();

        res[0] = -1;
        st.push(0);

        for (int i=1; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty() ? arr[st.peek()] : -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
