package BinarySearch.BSproblems;
import java.util.*;

class Solution {

    public static int sqrt(int x) {

        if(x==0 || x==1)
        {
            return x;
        }

        long l=1,h=x;
        while(l<=h)
        {
            long m=l+(h-l)/2;

            if(m*m==x)
            {
                return (int)m;
            }
            else if(m*m>x)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }

        return Math.round(h);
    }

    public static void main(String[] args) {
        System.out.println(sqrt(100));
    }
}
