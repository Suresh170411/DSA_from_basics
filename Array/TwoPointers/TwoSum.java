package TwoPointers;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {7,4,9,6,21,8,11,17};
        int k = 30;

        boolean res1 = bruteForce(arr, k);
        System.out.println(res1);

        boolean res2 = twoPointersApproach(arr, k);
        System.out.println(res2);
    }

    public static boolean bruteForce(int arr [], int k){
        int n = arr.length;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]+arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean twoPointersApproach(int arr [], int k){

        Arrays.sort(arr);

        int n = arr.length;

        int l = 0;
        int r = n-1;

        while (l < r){
            int sum = arr[l]+arr[r];

            if (sum == k){
                return true;
            }else if (sum < k){
                l++;
            }else {
                r--;
            }
        }
        return false;
    }
}
