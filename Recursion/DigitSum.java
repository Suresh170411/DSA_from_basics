public class DigitSum {
    public static void main(String[] args) {
        int n = 12345;

        conventionalMethod(n);
        System.out.println(recursionMethod(n));
    }

    public static void conventionalMethod(int n){
        
        int sum = 0;

        while (n != 0){
            sum+= n%10;
            n = n/10;
        }
        System.out.println(sum);
    }

    public static int recursionMethod(int n){
        if (n == 0) return 0;
        else return (n%10) + recursionMethod(n/10);
    }
}
