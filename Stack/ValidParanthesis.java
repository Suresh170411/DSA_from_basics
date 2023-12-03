package Stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "(){}[]";

        System.out.println(checkValidParantheses(str));
    }

    public static boolean checkValidParantheses(String str){
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()){
            if (c == '{' || c == '(' || c == '['){
                st.push(c);
            }else {
                if (st.isEmpty()) return false;
                
                char top = st.pop();
                
                if (c == ')' && (top == '{' || top == '[')) return false;
                if (c == '}' && (top == ')' || top == '[')) return false;
                if (c == ']' && (top == '{' || top == ')')) return false;
            }
        }
        return st.isEmpty();
    }
}
