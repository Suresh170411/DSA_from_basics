package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        brureForece(n);
    }

    public static void brureForece(int n){
        int res = 1;

        for (int i=1; i<=n; i++){
            res*= i;
        }
        System.out.println(res);
    }
}
