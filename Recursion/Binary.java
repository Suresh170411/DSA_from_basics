public class Binary{
    public static void main(String[] args) {
        int n = 25;
        recursiveFunction(n);
    }
    
    public static void recursiveFunction(int n){
        if (n == 0){
            return;
        }else {
            recursiveFunction(n/2);
            System.out.print(n%2);
        }
    }
}