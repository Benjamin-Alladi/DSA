package BinarySearch;
import java.util.*;

class FirstLastOcc{

    static int bs(int[] a,int t,boolean searchFirst)
    {
        int ans=-1,l=0,h=a.length-1;
        while(l<=h)
        {
            int m= l+(h-l)/2;
            if(a[m]==t)
            {
                ans=m;
                if(searchFirst)
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
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
        return ans;
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     int[] a= {1,2,6,6,10,10,100};
     System.out.println(bs(a,10,true));
     System.out.println(bs(a,10,false));
     sc.close();
    }
}