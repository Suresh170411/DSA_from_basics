package TwoPointers;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int arr [] = {7,4,9,6,21,8,11,17};
        int K = 34;
        bruteForceApproch(arr, K);
        boolean res = twoPointersApproach(arr, K);
        System.out.println(res);
    }

    public static void bruteForceApproch(int arr [], int K){
        int n = arr.length;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == K){
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }

    public static boolean twoPointersApproach(int arr [], int k){
        int n = arr.length;

        Arrays.sort(arr);

        int i = 0;
        int l = i+1;
        int r = n-1;

        while (i < n){
            while (l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if (sum == k){
                    return true;
                }else if (sum < k){
                    l++;
                }else {
                    r--;
                }
            }
            i++;
        }
        return false;
    }
}
