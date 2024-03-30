import java.util.*;

class setBitCount{

    // Kernighan’s bit count algorithm
    static int sbc(int n)
    {
        int c=0;
        while(n!=0)
        {
            n= n&(n-1);
            c++;
        }
        return c;
    }

    // Every even number (n) has the same amount of bits as (n/2).
    // Every odd number (n) has the amount of bits as (n/2) + 1.
    public static void main(String[] args) {
        System.out.println(sbc(8));
    }
}