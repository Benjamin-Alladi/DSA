package Maths;
import java.util.*;


// sieve of eratosthenes to find find all Primes smaller than n.
public class RangePrime {

    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    static void sieve(int n)
    {
        boolean[] a= new boolean[n+1];
        a[2]=true;

        for(int i=2;i<a.length;i++)
        {
            // If the number is Prime, then all its multiples can't be Prime.
            if(isPrime(i))
            {
                a[i]=true;
                for(int j=i+i;j<a.length;j+=i)
                {
                    a[j]=false;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==true)
            {
                System.out.print(i+" ");
            }
        }

        System.out.println("\n"+Arrays.toString(a));
    }
    public static void main(String[] args) {
        sieve(30);
    }
}
