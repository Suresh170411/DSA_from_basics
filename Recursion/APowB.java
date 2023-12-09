public class APowB{
    public static void main(String[] args) {
        int a = 3, b = 1;
        int res = findAPowB(a, b);
        System.out.println(res);
    }

    public static int findAPowB(int a, int b){
        if (b == 0) return 1;
        else {
            return a*findAPowB(a, b-1);
        }
    }
}