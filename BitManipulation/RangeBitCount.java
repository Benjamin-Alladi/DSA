import java.util.*;

public class RangeBitCount {

    // Every even number (n) has the same amount of bits as (n/2).
    // Every odd number (n) has the amount of bits as (n/2) + 1.
    static void dp_rbc(int n)
    {
        int tc=0;
        int[] bit= new int[n+1];
        bit[0]=0;

        for(int i=1;i<=n;i++)
        {
            bit[i]= bit[i/2]+ (i%2);
            tc+=bit[i];
        }
        System.out.println(Arrays.toString(bit)+" "+tc);
    }

    static void rbc(int n)
    {
        int tc=0;
        for(int i=0;i<=n;i++)
        {
            int x=i,c=0;
            while(x!=0)
            {
                x= x&x-1;
                c++;
            }
            System.out.println("SetBits in "+i+" given Range: "+c);
            tc+=c;
        }
        System.out.println("Total SetBits in given Range: "+tc);
    }
    public static void main(String[] args) {
        rbc(10);
        dp_rbc(10);
    }
}
