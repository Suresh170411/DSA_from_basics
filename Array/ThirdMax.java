import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {
    public static void main(String[] args) {
        int arr [] = {2,2,3,1};

        thirdMax(arr);

    }
    public static void thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums){
            set.add(i);
        }

        int arr [] = new int [set.size()];
        int index = 0;
        for (int i : set){
            arr[index++] = i;
        }

        Arrays.sort(arr);

        int thirdMax = Integer.MIN_VALUE;
        if (arr.length > 2){
            for (int i=0; i<arr.length-2; i++){
                if (arr[i] > thirdMax){
                    thirdMax = arr[i];
                }
            }
        }else {
            thirdMax = arr[1];
        }
        
        System.out.println(thirdMax);
    }
}
