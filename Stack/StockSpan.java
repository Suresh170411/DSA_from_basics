package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan{
    public static void main(String[] args) {
        int arr [] = {100,80,60,70,60,75,85};

        bruteForce(arr);
        stackApproach(arr);
    }

    public static void bruteForce(int arr []){
        int n = arr.length;
        int res [] = new int [n];

        for (int i=n-1; i>=0; i--){
            int count = 0;
            for (int j=i; j>=0 && arr[j] <=arr[i]; j--){
                // if (arr[j] <= arr[i]){
                    count++;
                // }else {
                //     break;
                // }
            }
            res[i] = count;
        }

        System.out.println(Arrays.toString(res));
    }

    public static void stackApproach(int arr []){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        int res [] = new int [n];

        res[0] = 1;
        st.push(0);

        for (int i=1; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            // if (!st.isEmpty()){
            //     res[i] = i - st.peek();
            // }else{
            //     res[i] = i+1;
            // }

            res[i] = !st.isEmpty() ? i-st.peek() : i+1;
            
            st.push(i);
        }

        System.out.println(Arrays.toString(res));
    }
}