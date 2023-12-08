public class FindLengthOfOccurance {
    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,2,2,2,2,3,5,8,9,10};
        int target = 2;

        int first = FindFirstOccurance.findFirstOccuranceOfTheElement(arr, target);
        int last = FindLastOccurance.findLastOccuranceElementFromArray(arr, target);

        if (first == -1 || last == -1){
            System.out.println("Element not found !");
        }else {
            System.out.println("Element " + target + " occured in array for " + ((last-first)+1) + " times");
        }

    }
}
