package DSA_from_basics.Flow_of_program;

import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int sum = 0;

        while (n != "x"){
            sum+= Integer.parseInt(n);
        }
        System.out.println(sum);
        sc.close();
    }
}
