package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDups {
    public static void main(String[] args) {
        int arr [] = {12,4,4,1,4,1,5,85,5};

        checkFunc(arr);
    }

    public static void checkFunc(int arr []){
        boolean result1 = containsDuplicate(arr);

        if (result1){
            System.out.println("Contains duplicate");
        }else {
            System.out.println("Does not contain duplicates");
        }

        boolean result2 = optimizedApproach(arr);

        if (result2){
            System.out.println("Contains duplicate");
        }else {
            System.out.println("Does not contain duplicates");
        }

    }

    public static boolean containsDuplicate(int arr []){
        int n = arr.length;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean optimizedApproach(int arr[]){

        Map<Integer,Integer> hm = new HashMap<>();

        for (int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for (Integer i : hm.keySet()){
            if (hm.get(i) > 1){
                return true;
            }
        }
        return false;
    }
}
