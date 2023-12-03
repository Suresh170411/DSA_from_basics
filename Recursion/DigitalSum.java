public class DigitalSum {
    public static void main(String[] args) {
        //int n = 148;
        //int k = 3;
        int p = 148148148;

        int res = func(p);
        while (res >= 10){
            res = func(res);
        }
        System.out.println(res);
    }

    public static int func(int n){
        if (n/10 == 0) return n;
        else{
            return (n%10) + func(n/10);
        }
    }
}
