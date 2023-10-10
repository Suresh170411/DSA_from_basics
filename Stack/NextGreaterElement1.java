package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int arr [] = {1,3,4,2};

        nextGreaterElement(arr);
    }

    public static void nextGreaterElement(int arr []){
        int n = arr.length;

        int res [] = new int [n];

        Stack<Integer> stack = new Stack<>();

        for(int i=n-1; i>=0; i--){

            //if stack is empty, no greater element is present
            if (stack.isEmpty()){
                stack.push(arr[i]);
                res[i] = -1;
            }

            //if top of stack is greater, then it is next greater element
            if (stack.peek() > arr[i]){
                stack.push(arr[i]);
                res[i] = stack.peek();
            }

            //remove all smaller element from stack
            while (stack.peek() <= arr[i] && !stack.isEmpty()){
                stack.pop();
            }

            if (stack.isEmpty()){
                res[i] = -1;
            }else {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        System.out.println(Arrays.toString(res));
    }
}
