package DSA_from_basics.Flow_of_program;

public class HcfAndLcm {
    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 36;

        System.out.println("Highest Common Factor : " + getHcf(num1, num2));

        System.out.println("Least Common Multiple : " + getLcm(num1, num2));
    }

    public static int getHcf(int num1, int num2){
        
        int result = 0;

        for (int i=1; i<=num1 || i<=num2; i++){
            if (num1%i == 0 && num2%i == 0){
                result = i;
            }
        }
        return result;
    }

    public static int getLcm(int num1, int num2){

        int product = num1*num2;

        int result = product/getHcf(num1, num2);

        return result;
    }
}
