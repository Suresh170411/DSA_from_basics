import java.util.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4}; //5

        int prices2 [] = {7,6,4,3,1}; //0

        int prices3 [] = {3,1,4,8,7,2,5};

        buyAndSellStockBruteForce(prices3);
        buyAndSellStocksMethod2(prices3);
        optimizedSolution(prices3);
    }

    public static void buyAndSellStockBruteForce(int arr []){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[j] - arr[i] > max){
                    max = arr[j] - arr[i];
                }
            }
        }
       
        int res = 0;

        if (max > 0){
            res = max;
        }
        System.out.println(res);
    }

    public static void buyAndSellStocksMethod2(int arr []){
        int n = arr.length;

        int maxVal [] = new int [n];

        int max = arr[n-1];

        for (int i=n-1; i>=0; i--){
            if (arr[i] > max){
                max = arr[i];
            }
            maxVal[i] = max;
        }
        
        int maxPrice = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if ((maxVal[i]-arr[i]) > maxPrice){
                maxPrice = maxVal[i]-arr[i];
            }
        }
        System.out.println(maxPrice);
    }

    public static void optimizedSolution(int arr []){
        int n = arr.length;

        int minSoFar = arr[0];
        int maxProfit = 0;

        for (int i=0; i<n; i++){
            if (arr[i] < minSoFar){
                minSoFar = arr[i];
            }
            int diff = arr[i] - minSoFar;
            
            if (diff > maxProfit){
                maxProfit = diff;
            }
        }
        System.out.println(maxProfit);
    }
}
