import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoarrII {
    public static void main(String[] args) {
        int arr1 [] = {1,2,2,1}, nums2 [] = {2,2};

        intesectionOfTwoArray(arr1, nums2);
    }

    public static void intesectionOfTwoArray(int nums1 [], int nums2 []){
        
        Map<Integer,Integer> hm = new HashMap<>();

        for (int i : nums1){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        List<Integer> list = new ArrayList<>();

        for (int i : nums2){
            if (hm.containsKey(i) && hm.get(i) > 0){
                list.add(i);
                hm.put(i, hm.get(i)-1);
            }
        }
        System.out.println(list);
    }
}
