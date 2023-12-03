import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {1,2,4,7,0};

        int target = 9;

        towSum(arr, target);
    }

    public static void towSum(int arr [], int target){
        int n = arr.length;

        int res [] = new int [2];

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] + arr[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
