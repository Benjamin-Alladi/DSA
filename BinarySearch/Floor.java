package BinarySearch;
import java.util.*;

class Floor{

    static int floor(int[] a,int t)
    {
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int m= l+(h-l)/2;

            if(a[m]==t)
            {
                return a[m];
            }
            else if(a[m]<t)
            {
                l=m+1;
            }
            else
            {
                h=m-1;
            }
        }
        return a[h];
    }

    static int recFloor(int[] a,int t,int l,int h)
    {
        if(l>h)
        {
            return a[h];
        }
        else
        {
            int m= l+(h-l)/2;
            if(a[m]==t)
            {
                return a[m];
            }
            else if(a[m]<t)
            {
                return recFloor(a,t,m+1,h);
            }
            else
            {
                return recFloor(a,t,l,m-1);
            }
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println(floor(new int[]{1,2,2,4,10,12,100},6));
     System.out.println(recFloor(new int[]{1,2,2,4,10,12,100},6,0,6));
     sc.close();
    }
}