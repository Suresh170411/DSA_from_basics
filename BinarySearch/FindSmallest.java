public class FindSmallest {
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,8,9,10,1,2};
        int n = arr.length;

        int res = findSmallestFromSortedRotetedArr(arr, n);
        System.out.println(arr[res]);
    }

    public static int findSmallestFromSortedRotetedArr(int arr [], int n){
        int low = 0;
        int high = n-1;

        if (arr[low] <= arr[high]){
            return 0;
        }

        while (low <= high) {
            int mid = low+(high-low)/2;

            if (arr[mid-1] > arr[mid]){
                return mid;
            }else if (arr[mid] > arr[mid+1]){
                return mid+1;
            }else if (arr[low] <= arr[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}
