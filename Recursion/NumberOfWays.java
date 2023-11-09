public class NumberOfWays {
    public static void main(String[] args) {
        int n = 12;
        int res = findTheWaysPossible(n);
        System.out.println(res);
    }

    public static int findTheWaysPossible(int n){
        if (n < 0) return 0;
        if (n == 0) return 1;
        else return findTheWaysPossible(n-4) + findTheWaysPossible(n-8);
    }
}
