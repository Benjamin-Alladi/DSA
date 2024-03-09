package BinarySearch;
import java.util.*;

class FloorCeiling{

    // Ceiling is the smallest element in the array such that it is greater than (or) equal to the target.
    static int ceiling(int[] a,int t)
    {

        if(t>a[a.length-1])
        {
            return -1;
        }
        else
        {
            int s=0, e=a.length-1;

            while(s<=e)
            {
                int m= s+(e-s)/2;

                if(a[m]==t)
                {
                    return m;
                }
                else if(a[m]>t)
                {
                    e=m-1;
                }
                else
                {
                    s=m+1;
                }
            }

            // If the target is not found, then start crosses the end and loop breaks as the condition is evaluated to false.
            // end=mid start=end+1. Between the start and end, our target element can be inserted.
            // end-> smallest element among all the elements that are greater than (or) equal to target.
            // start-> greatest element among all the elents that are smaller than (or) equal to the target.
            return s;
        }
    }

    // Floor is the greatest element among all the elements that are less than (or) equal to the target.
    static int floor(int[] a,int t)
    {
        if(t<a[0])
        {
            return -1;
        }
        else
        {
            int s=0, e=a.length-1;

            while(s<=e)
            {
                int m= s+(e-s)/2;

                if(a[m]==t)
                {
                    return m;
                }
                else if(a[m]>t)
                {
                    e=m-1;
                }
                else
                {
                    s=m+1;
                }
            }

            // If the target is not found, then start crosses the end and loop breaks as the condition is evaluated to false.
            // end=mid start=end+1. Between the start and end, our target element can be inserted.
            // end-> smallest element among all the elements that are greater than (or) equal to target.
            // start-> greatest element among all the elements that are smaller than (or) equal to the target.
            return e;
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println(ceiling(new int[]{1,2,2,3,10,12,100},10));
     System.out.println(floor(new int[]{1,2,2,4,10,12,100},6));
     sc.close();
    }
}
