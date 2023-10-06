import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,0,0,0};
        int m = 3;
        int arr2 [] = {2,5,6};
        int n = 3;

        mergeArr(arr1, m, arr2, n);
    }

    public static void mergeArr(int arr1 [],int m, int arr2 [], int n){
        for (int i=0, j=m; i<n; i++){
            arr1[j++] = arr2[i]; 
        }
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
    }
}
