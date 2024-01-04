package DSA_from_basics.Basics;

public class DigitSum {
    public static void main(String[] args) {
        
        int num = 125;

        newApproach(num);
    }

    public static void newApproach(int n){
        
        int sum = 0;

        while (n != 0){
            sum+= n%10;
            n = n/10;
        }
        System.out.println(sum);
    }
}
