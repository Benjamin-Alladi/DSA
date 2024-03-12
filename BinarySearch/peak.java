package BinarySearch;
import java.util.*;

class Test{

    static int findPeak(int[] a)
    {
        int l=0,h=a.length-1;
        if(a.length==1)
        {
            return 0;
        }
        while(l<h)
        {
            int m= l+(h-l)/2;
            if(a[m]<a[m+1])
            {
                l=m+1;
            }
            else if(a[m]>a[m+1])
            {
                h=m;
            }
        }
        return l;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        
        int start = 1; 
        int end = (arr.length)-2;
        
        while(start <= end )
        {
            int mid = (start + end )/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                start = mid +1;
            }
            else if(arr[mid]>arr[mid+1])
            {
                end = mid -1;
            }
        }
        return arr.length-1;
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     int[] a= {1,10,100,200};
     System.out.println(findPeak(a));
     System.out.println(peakIndexInMountainArray(a));
     sc.close();
    }
}
