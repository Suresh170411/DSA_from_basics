// package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        brureForece(n);
        int res = factorialUsingRecursion(n);
        System.out.println(res);
    }

    public static void brureForece(int n){
        int res = 1;

        for (int i=1; i<=n; i++){
            res*= i;
        }
        System.out.println(res);
    }

    public static int factorialUsingRecursion(int n){
        if (n==0 || n==1) return n;
        else return n*factorialUsingRecursion(n-1);
    }
}
