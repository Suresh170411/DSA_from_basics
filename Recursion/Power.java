public class Power {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;

        conventionalMethod(n, m);
        System.out.println(recursionMethod(n, m));
    }

    public static void conventionalMethod(int n, int m){
        int pow = 1;
        while (m != 0){
            pow = pow*n;
            m--;
        }
        System.out.println(pow);
    }

    public static int recursionMethod(int n, int m){
        if (m == 0) return 1;
        else return n * recursionMethod(n, m-1);
    }
}
