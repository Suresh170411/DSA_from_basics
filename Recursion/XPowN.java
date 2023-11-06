public class XPowN {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(calculatePower(x, n));
        bruteForceApproach(x, n);
    }

    public static int calculatePower(int x, int n){

        if (n == 0) return 1;
        if (x == 0) return 0;

        int xPowNm1 = calculatePower(x, n-1);
        int xPowN = x * xPowNm1;

        return xPowN;
    }

    public static void bruteForceApproach(int x, int n){
        int res = 1;

        for (int i=1; i<=n; i++){
            res*= x;
        }
        System.out.println(res);
    }
}
