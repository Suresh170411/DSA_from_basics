public class FindFromInfiniteArray {
    public static void main(String[] args) {
        //assuming this is an array of length infinity
        int arr [] = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,5,5,5,6,7};

        findElementFromInfiniteArray(arr, 4);
    }

    public static void findElementFromInfiniteArray(int arr [], int element){
        int low = 0, high = 1;

        while (element > arr[high]) {
            low = high;
            high = high*2;
        }

        int res = findElement(arr, low, high, element);
        System.out.println(res);
    }

    public static int findElement(int arr [], int low, int high, int target){
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;

            if (target == arr[mid]){
                ans = mid;
                high = mid-1;
            }else if (target < arr[mid]){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
}
