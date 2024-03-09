package Sorting;
import java.util.*;

public class InsertionSort {

    // j=i+1
    static void is(int[] a,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1,-4,2,3,6,12,10,100};
        is(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
