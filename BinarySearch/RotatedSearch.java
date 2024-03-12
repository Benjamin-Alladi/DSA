package BinarySearch;

import java.util.*;

class Solution {

    // pivot is the largest element in the array
    static int pivot(int[] a) {
        
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int m= l+(h-l)/2;

            if(m<h && a[m]>a[m+1])
            {
                return m;
            }
            else if(m>l && a[m]<a[m-1])
            {
                return m-1;
            }
            else
            {
                // In left part
                if(a[m]>a[l])
                {
                    // search in right part
                    l=m+1;
                }
                // In right part
                else
                {
                    // search in left part
                    h=m-1;
                }
            }
        }
        return -1;
    }

    static int bs(int[] a,int t,int l,int h)
    {
        while(l<=h)
        {
            int m= (l+h)>>1;
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
        return-1;
    }

    public static int search(int[] a, int target) {
        int pi= pivot(a);
        System.out.println("Pivot Index: "+pi);

        if(pi==-1)
        {
            return bs(a,target,0,a.length-1);
        }
        if(a[pi]==target)
        {
            return pi;
        }
        else if(target>=a[0])
        {
            return bs(a, target, 0, pi-1);
        }
        else
        {
            return bs(a, target, pi+1,a.length-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
    }
}