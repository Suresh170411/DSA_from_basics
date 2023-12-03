package Stack;

import java.util.Stack;

public class ReduceString {
    public static void main(String[] args) {
        String str = "aaabccddd";

        reduceString(str);
    }

    public static void reduceString(String str){
        Stack<Character> st = new Stack<>();

        for (char s : str.toCharArray()){

            if (!st.isEmpty() && st.peek() == s){
                st.pop();
            }else {
                st.push(s);
            }
        }

        for (Character c : st){
            System.out.print(c);
        }
        System.out.println();
    }
}
