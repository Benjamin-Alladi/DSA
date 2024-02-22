package Sorting;
import java.util.*;

public class SelectionSort {

    // Select the element and swap it with the minimum element present in the remaining part of Array.
    static void ss(int[] a, int n)
    {
        for(int i=0;i<n;i++)
        {
            int min=a[i];
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    minIndex=j;
                }
            }

            if(minIndex!=i)
            {
                int t=a[i];
                a[i]=a[minIndex];
                a[minIndex]=t;
            }
        }
    }

    // Select the element and swap it with the maximum element present in the remaining part of Array.
    static void ss_DO(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            int max=a[i];
            int maxIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                    maxIndex=j;
                }
            }

            if(maxIndex!=i)
            {
                int t=a[i];
                a[i]=a[maxIndex];
                a[maxIndex]=t;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,1,3,1,10,12,100};
        ss(a,a.length);
        // ss_DO(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
