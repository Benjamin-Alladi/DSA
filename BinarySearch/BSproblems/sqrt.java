package BinarySearch.BSproblems;
import java.util.*;

class Solution {

    public static int sqrt(int n) {
        long l=1,h=n;

        while(l<=h)
        {
            long m= (l+h)>>1;
            if(m*m==n)
            {
                return (int)m;
            }
            else if(m*m>n)
            {
                h=m-1;
            }
            else if(m*m<n)
            {
                l=m+1;
            }
        }
        return (int)h;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(sqrt(28));
        sc.close();
    }
}
