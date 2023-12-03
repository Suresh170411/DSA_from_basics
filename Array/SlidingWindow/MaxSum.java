package SlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSum {
    public static void main(String[] args) {
        int arr [] = {1,4,2,10,23,3,1,0,20};
        int k = 4;
        // bruteForce(arr, k);
        // anotherApproach(arr, k);
        slidingWindow(arr, k);
    }

    public static void bruteForce(int arr [], int K){
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                List<Integer> list = new ArrayList<>();
                for (int k=i; k<=j; k++){
                    list.add(arr[k]);
                }
                if (list.size() == K){
                    int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
                    if (sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void anotherApproach(int arr [], int K){
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i=0; i<=n-K; i++){
            int sum = 0;
            for (int j=i; j<=i+K-1; j++){
                sum+= arr[j];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);  // O(N*K);
    }

    public static void slidingWindow(int arr [], int K){
        int n = arr.length;

        int sum = 0;
        for (int i=0; i<K; i++){
            sum+= arr[i];
        }

        int curr_sum = sum;

        for (int i=K; i<n; i++){
            curr_sum = curr_sum - arr[i-K] + arr[i];

            if (curr_sum > sum){
                sum = curr_sum;
            }
        }
        System.out.println(sum);
    }
}
