import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) {
        
        st.push(1);
        st.push(2);
        st.push(3);

        revere();

        int n = st.size();

        for (int i=0; i<n; i++){
            int a = st.pop();
            System.out.println(a);
        }
    }
    
    public static void revere(){
        if (!st.isEmpty()){
            int x = st.peek();
            st.pop();
            revere();
            insert(x);
        }
    }

    public static void insert(int x){
        if (st.isEmpty()){
            st.push(x);
        }else{
            int a = st.peek();
            st.pop();
            insert(x);
            st.push(a);
        }
    }
}
