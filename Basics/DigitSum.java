package DSA_from_basics.Basics;

public class DigitSum {
    public static void main(String[] args) {
        
        int num = 125;

        // int sum = 0;

        // while (num != 0){
        //     sum+= num%10;
        //     num = num/10;
        // }
        // System.out.println(sum);

        newApproach(num);
    }

    public static void newApproach(int n){
        
        int sum = 0;

        for (int i=0; i<=n; i++){
            sum+= n%10;
            n = n/10;
        }
        System.out.println(sum);
    }
}
