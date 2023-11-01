public class HCF {
    public static void main(String[] args) {
        int a = 36;
        int b = 60;

        System.out.println(recursionMethod(a, b));
    }

    public static void conventionalMethod(int a, int b){
        
    }

    public static int recursionMethod(int a, int b){
        if (a == 0) return b;

        else return recursionMethod(b%a, a);
    }
}
