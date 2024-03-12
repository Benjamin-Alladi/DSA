package BinarySearch;
// import java.util.*;

public class InfiniteArray {

    // Binary Search in infinite size array.
    static int ans(int[] a,int target)
    {
        int low = 0;
        int high = 1;

        // Extend the range until we find a range that contains the target.
        try 
        {
            while(target>a[high])
            {
                low = high + 1;
                high*=2;
                System.out.println(low+" "+high);
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            // If we catch an ArrayIndexOutOfBoundsException, update the right bound to be the last element
            // (assuming it's larger than the target).
            high=low+(high-low)/2;
            System.out.println(low+" "+high);
        }
        // Perform binary search within the identified range.
        return bs(a,target,low,high);
    }

    static int bs(int[] a,int target,int low,int high)
    {
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) 
            {
                return mid;
            } 
            else if (a[mid]< target) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a= {1,2,2,4,10,10,12,100,200,300,500,1000};
        System.out.println(ans(a,1000));
    }
}
