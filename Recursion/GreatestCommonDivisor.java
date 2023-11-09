public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 51,b = 68;
        System.out.println(GCF(a, b));
    }

    public static int GCF(int a, int b){
        if (a == 0) return b;
        else {
            return GCF(b%a, a);
        }
    }
}
