public class SubSequence {
    public static void main(String[] args) {
        String input = "abc";

        String ans = "";
        int low = 0;
        int high = input.length()-1;
        char [] arr = input.toCharArray();

        subSeq(ans, arr, low, high);
    }

    public static void subSeq(String ans, char [] arr, int low, int high){

        if (low <= high+1 && !ans.equals("")){
            System.out.println(ans);
        }

        for (int i=low; i<=high; i++){
            subSeq(ans+arr[i], arr, i+1, high);
        }
    }
}
