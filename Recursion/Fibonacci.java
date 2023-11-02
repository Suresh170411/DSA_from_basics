public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        brureForece(n);
        System.out.println("=======");
        fibonacci(0, 1, n);
    }

    public static void brureForece(int n){
        int a = 0;
        int b = 1;

        for (int i=0; i<n; i++){
            int sum = a+b;
            a = b;
            b = sum;

            System.out.println(sum);
        }
    }

    public static void fibonacci(int a, int b,int n){
        if (n==0) return;
        else {
            int c = a+b;
            System.out.println(c);
            fibonacci(b, c, n-1);
        }
    }
}
