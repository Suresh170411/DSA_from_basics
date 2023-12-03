public class PrintSum {
    public static void main(String[] args) {
        int n = 5;
        int res = printSumOfNnaturalNumbers(n);
        System.out.println(res);
    }

    public static int printSumOfNnaturalNumbers(int n){
        if (n==0 || n==1) return n;
        else {
            return n+printSumOfNnaturalNumbers(n-1);
        }
    }
}
