package Searching;
import java.util.*;

class LinearSearch{

    static int ls(int[] a,int t)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==t)
            {
                return i;
            }
        }
        return -1;
    }

    static int lsrec(int[] a,int t,int i)
    {
        if(i==a.length)
        {
            return -1;
        }
        else
        {
            if(a[i]==t)
            {
                return i;
            }
            else
            {
                return lsrec(a,t,i+1);
            }
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     int[] a= {1,10,6,100};
     System.out.println(ls(a,100));
     System.out.println(lsrec(a,100,0));
     sc.close();
    }
}