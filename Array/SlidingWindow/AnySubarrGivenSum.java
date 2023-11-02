package SlidingWindow;

public class AnySubarrGivenSum {
    public static void main(String[] args) {
        int arr [] = {1,2,3,30,10,20,1,2};
        int sum = 33;

        boolean res = slidingWindowTechnique(arr, sum);
        System.out.println(res);

        System.out.println(bruteForce(arr, sum));

        slidingWindowTechnique2(arr, sum);
    }

    public static boolean slidingWindowTechnique(int arr[], int sum){
        int n = arr.length;

        int windowSum = 0;
        int top = 0;

        for (int i=0; i<n; i++){
            while (windowSum < sum && top < n){
                windowSum+= arr[top++];
            }

            if (windowSum == sum){
                return true;
            }

            windowSum = windowSum - arr[i];
        }
        return false;
    }

    public static boolean bruteForce(int arr [], int sum){
        
        int n = arr.length;

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                int curr_sum = 0;
                for (int k=i; k<=j; k++){
                    curr_sum+= arr[k];
                }
                if (curr_sum == sum) return true;
            }
        }
        return false;
    }

    public static void slidingWindowTechnique2(int arr [], int sum){
        int top = 0;
        int windowSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            while (windowSum < sum && top < arr.length) {
                windowSum+= arr[top++];
            }
            if (windowSum == sum){
                System.out.println(i+" "+ (top-1));
                int diff = top-i;
                if (diff > max){
                    max = diff;
                }
            }
            windowSum = windowSum - arr[i];
        }

        System.out.println(max);
    }
}
