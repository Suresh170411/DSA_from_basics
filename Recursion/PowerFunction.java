public class PowerFunction {
    public static void main(String[] args) {
        int x = 2;
        int n = 1;

        System.out.println(powerFunctionRecursive(x, n));
    }

    public static int powerFunctionRecursive(int x, int n){
        if (n == 0) return 1;
        if (n == 1) return x;

        return x * powerFunctionRecursive(x, n-1);
    }
}
