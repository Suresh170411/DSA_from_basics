// package Recursion;

public class PrintNums {
    public static void main(String[] args) {
        int n = 5;
        printNumsAsc(n);
        System.out.println("======");
        printNumsDesc(n);
    }

    public static void printNumsAsc(int n){
        if (n==0) return;
        else {
            printNumsAsc(n-1);
            System.out.println(n);
        }
    }

    public static void printNumsDesc(int n){
        if (n==0) return;
        else {
            System.out.println(n);
            printNumsAsc(n-1);
        }
    }
}
