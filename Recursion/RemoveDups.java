public class RemoveDups {
    public static void main(String[] args) {
        String str = "aabcde";
        String res = removeDups(str);
        System.out.println(res);
    }

    public static String removeDups(String str){
        String res = "";
        for (int i=0; i<str.length(); i++){
            if (i==0){
                if (str.charAt(i) != str.charAt(i+1)){
                    res+= str.charAt(i);
                }
            }else if (i == str.length()-1){
                if (str.charAt(i) != str.charAt(i-1)){
                    res+= str.charAt(i);
                }
            }else {
                if (str.charAt(i) != str.charAt(i+1) && str.charAt(i) != str.charAt(i-1)){
                    res+= str.charAt(i);
                }
            }
        }
        if (str.length() == res.length()) return res;
        else return removeDups(res);
    }
}
