package SlidingWindow;

public class AnySubarrGivenSum {
    public static void main(String[] args) {
        int arr [] = {1,4,20,3,10,5};
        int sum = 33;
        boolean res = slidingWindowTechnique(arr, sum);

        System.out.println(res);
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
}
