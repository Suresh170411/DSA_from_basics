package DSA_from_basics.Basics;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        findLargest(num1, num2, num3);
        getMax(num1, num2, num3);
        sc.close();
    }

    public static void findLargest(int num1, int num2, int num3){
        int max = num1;

        if (num2 > max){
            max = num2;
        }else if (num3 > max){
            max = num3;
        }

        System.out.println("Max number in " + num1 +","+ num2 +","+ num3 +" is : " + max);
    }

    public static void getMax(int a, int b, int c){

        int max = Math.max(c, Math.max(a,b));

        System.out.println("Max is : " + max);
    }
}
