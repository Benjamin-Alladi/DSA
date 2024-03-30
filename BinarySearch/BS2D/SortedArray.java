package BinarySearch.BS2D;
import java.util.*;

public class SortedArray {

    // The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given ‘mat’ or not.

    static int[] find(int[][] a, int t)
    {
        int r=0,c=a[0].length-1;

        while(r<a.length && c>=0)
        {
            if(a[r][c]==t)
            {
                return new int[]{r,c};
            }
            else if(a[r][c]<t)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    
    static int bs(int[] a, int t)
    {
        int l=0,h=a.length-1;

        while(l<=h)
        {
            int m=(l+h)>>1;
            if(a[m]==t)
            {
                return m;
            }
            else if(a[m]>t)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int target=20;
        int[][] a= {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60},
        };

        // Brute-Force:
        for(int i=0;i<a.length;i++)
        {
            if(a[i][0]<=target && target<=a[i][a[i].length-1])
            {
                System.out.println(i+" "+ bs(a[i],target));
            }
        }

        // Optimised:
        int[] r= find(a,target);
        System.out.println(Arrays.toString(r));
    }
}
