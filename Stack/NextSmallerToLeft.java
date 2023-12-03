import java.util.Arrays;
import java.util.Stack;

public class NextSmallerToLeft {
    public static void main(String[] args) {
        int arr [] = {1,6,4,10,2,5};

        bruteForce(arr);
        usingStack(arr);
    }

    public static void bruteForce(int arr []){
        int n = arr.length;

        int res [] = new int [n];

        for (int i=n-1; i>=0; i--){
            for (int j=i; j>=0; j--){
                if (arr[j] < arr[i]){
                    res[i] = arr[j];
                    break;
                }else {
                    res[i] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(res));
    }

    public static void usingStack(int arr []){
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
