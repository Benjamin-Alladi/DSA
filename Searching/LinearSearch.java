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

    static int[] ls2d(int[][] a,int t)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==t)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] ls2drec(int[][] a,int t,int i,int j)
    {
        if(i==a.length)
        {
            return new int[]{-1,-1};
        }
        else
        {
            if(a[i][j]==t)
            {
                return new int[]{i,j};
            }
            else
            {
                if(j==a[i].length-1)
                {
                    i++;
                    j=0;
                }
                else
                {
                    j++;
                }
                return ls2drec(a,t,i,j);
            }
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     int[] a= {1,10,6,100};
     System.out.println(ls(a,100));
     System.out.println(lsrec(a,100,0));

     int[][] arr= {
        {1,10,10},
        {50,20,100}
     };

     int[] r= ls2d(arr,100);
     System.out.println(Arrays.toString(r));
     r= ls2drec(arr,100,0,0);
     System.out.println(Arrays.toString(r));
     sc.close();
    }
}