public class ReduceString {
    public static void main(String[] args) {
        String str = "axxxazyya";

        String res = func(str);
        System.out.println(res);
    }
    public static String func(String s){
        if (s.trim().isEmpty()) return "Empty String";
        if (s.length() == 1) return s;

        String res = "";
        for (int i=0; i<s.length(); i++){
            if (i == 0) {
                if (s.charAt(i) != s.charAt(i+1)) res+= s.charAt(i);
            }else if (i == s.length()-1){
                if (s.charAt(i) != s.charAt(i-1)) res+= s.charAt(i);
            }else {
                if (s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i+1)) res+= s.charAt(i);
            }
        }
        if (s.length() == res.length()) return res;
        else return func(res);
    }
}
