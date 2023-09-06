package DSA_from_basics.Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num1 = 0, num2 = 1, counter = 0;

        while (counter < n){
            
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;

            counter++;
        }
        System.out.println(num1);
    }
}
