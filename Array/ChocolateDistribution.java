import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr [] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        chocolateDistribution(arr, m);
    }

    public static void chocolateDistribution(int arr [], int m){
        
        int n = arr.length;
        int right = m-1;

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i=0; i+m <= n; i++){
            int diff = arr[right++]-arr[i];

            if (diff < min){
                min = diff;
            }
        }
        System.out.println(min);
    }
}
