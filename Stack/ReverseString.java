package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";

        reverseString(str);
    }

    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()){
            st.add(c);
        }

        while (!st.isEmpty()){
            sb.append(st.pop());
        }

        System.out.println(sb.toString());
    }
}
