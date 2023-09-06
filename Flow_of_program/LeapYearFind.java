package DSA_from_basics.Flow_of_program;

import java.util.Scanner;

public class LeapYearFind {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        boolean result = isLeapYear(year);

        if (result){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            return true;
        }else {
            return false;
        }
    }
}
