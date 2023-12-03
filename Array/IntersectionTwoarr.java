import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoarr {
    public static void main(String[] args) {
        int arr1 [] = {1,2,4,4,2};
        int arr2 [] = {2,4,6};

        intersectionOfTwoArray(arr1, arr2);
    }

    public static void intersectionOfTwoArray(int arr1 [], int arr2 []){
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : arr1){
            set1.add(i);
        }

        for (int i : arr2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int result [] = new int [set2.size()];

        int index = 0;

        for (int i : set2){
            result[index++] = i;
        }

        System.out.println(Arrays.toString(result));
    }
}
