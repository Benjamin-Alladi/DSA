package Sorting;
import java.util.*;
public class BubbleSort {

    static void bs(int[] a,int n)
    {
        for(int i=1;i<=n-1;i++)
        {
            boolean swap= false;
            for(int j=0;j<n-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;

                    swap= true;
                }
            }

            if(swap==false)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,1};
        bs(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
