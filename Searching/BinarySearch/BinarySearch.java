import java.util.*;

class BinarySearch {

    static int bs(int[] a,int t)
    {
        int l=0, h=a.length-1;

        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(a[m]==t)
            {
                return m;
            }
            
            // If array is in Ascending Order
            if(a[0]<a[a.length-1])
            {
                if(a[m]>t)
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            // If array is in Descending Order
            else
            {
                if(a[m]>t)
                {
                   l=m+1;
                }
                else
                {
                    h=m-1;
                }
            }
        }
        return -1;
    }

    static int bsrec(int[] a,int t,int l,int h)
    {
        if(l>h)
        {
            return -1;
        }
        else
        {
            int m= l+(h-l)/2;
            if(a[m]==t)
            {
                return m;
            }

            // If array is in Ascending Order
            if(a[0]<a[a.length-1])
            {
                if(a[m]>t)
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
                return bsrec(a,t,l,h);
            }
            // If array is in Descending Order
            else
            {
                if(a[m]>t)
                {
                    l=m+1;
                }
                else
                {
                    h=m-1;
                }
                return bsrec(a,t,l,h);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(bs(new int[] { 1, 5, 6, 10, 100 }, 100));
        System.out.println(bsrec(new int[] { 1, 5, 6, 10, 100 }, 100, 0, 5));

        System.out.println(bs(new int[]{100,10,6,5,1},100));
        System.out.println(bsrec(new int[]{100,10,6,5,1},100,0,5));
        sc.close();
    }
}
