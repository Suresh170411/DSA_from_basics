public class FindSquareRoot {
    public static void main(String[] args) {
        int element = 25;

        int squareRoot = findSquareRoot(element);
        if (squareRoot == -1){
            System.out.println("Square root for " + element + " is not possible ! Please provie another number.");
        }else {
            System.out.println("Square Root of " + element + " is : " + squareRoot);
        }
    }

    public static int findSquareRoot(int n){
        int low = 0, high = n;

        while (low  <= high){
            int mid = low+(high-low)/2;

            if (mid*mid == n){
                return mid;
            }else if (mid*mid < n){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}
