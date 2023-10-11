import java.util.Arrays;

public class StockSpan{
    public static void main(String[] args) {
        int arr [] = {100,80,60,70,60,75,85};

        bruteForce(arr);
    }

    public static void bruteForce(int arr []){
        int n = arr.length;
        int res [] = new int [n];

        for (int i=n-1; i>=0; i--){
            int count = 0;
            for (int j=i; j>=0 && arr[j] <=arr[i]; j--){
                // if (arr[j] <= arr[i]){
                    count++;
                // }else {
                //     break;
                // }
            }
            res[i] = count;
        }

        System.out.println(Arrays.toString(res));
    }
}