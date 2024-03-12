package BinarySearch;
import java.util.*;

class Ceil{

    static int ceil(int[] a,int t)
    {
        int l=0,h=a.length-1;

        while(l<=h)
        {
            int m= l+(h-l)/2;
            if(a[m]==t)
            {
                return a[m];
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
        return a[l];
    }

    static int recCeil(int[] a,int t,int l,int h)
    {
        if(l>h)
        {
            return a[l];
        }
        else
        {
            int m= l+(h-l)/2;
            if(a[m]==t)
            {
                return a[m];
            }
            else if(a[m]>t)
            {
                return recCeil(a, t, l, m-1);
            }
            else
            {
                return recCeil(a,t,m+1,h);
            }
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println(ceil(new int[]{1,2,2,4,10,12,100},6));
     System.out.println(recCeil(new int[]{1,2,2,4,10,12,100},6,0,6));
     sc.close();
    }
}