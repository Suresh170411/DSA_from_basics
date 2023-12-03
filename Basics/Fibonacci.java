package Basics;

import java.util.Scanner;

public class Fibonacci {
    public static int count = 0;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese provide the number : ");
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;

        bruteForceApproach(num1, num2, n);
        printFibo(num1, num2, n);
        
        sc.close();
    }

    public static void bruteForceApproach(int num1, int num2, int n){
        int counter = 0;

        while (counter < n){
            
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;

            counter++;
        }
        System.out.println(num1);
    }
    public static void printFibo(int a, int b, int n){
        if (n == 0){
            return;
        }else {
            int sum = a+b;
            count++;
            System.out.println("For term : "+count+" the fibonacci is : "+sum);
            
            printFibo(sum, a, n-1);
        }
    }
}
