package DSA_from_basics.Flow_of_program;

public class SumOfTwo {
 
    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        System.out.println(getSum(a, b));
        System.out.println(getDivision(a, b));
        System.out.println(getMultiplication(a, b));
        System.out.println(getSubtraction(a, b));
    }

    public static int getSum(int a , int b){
        return a+b;
    }

    public static double getDivision(int a , int b){
        double res = (double)a/b;
        return Double.parseDouble(String.format("%.2f", res));
    }

    public static int getMultiplication(int a, int b){
        return a*b;
    }

    public static int getSubtraction(int a , int b){
        return a-b;
    }
}
