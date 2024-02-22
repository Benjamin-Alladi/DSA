import java.util.*;

class rec2{

    static int factorial(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
        else
        {
            return fib(n-1)+ fib(n-2);
        }
    }

    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+sum(n-1);
        }
    }


    static int digitSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            int r= n%10;
            return r+digitSum(n/10);
        }
    }
    static int digitProduct(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        else
        {
            return (n%10)*digitProduct(n/10);
        }
    }

    static int reverse(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        else
        {
            int r= n%10;
            int l= (int)Math.pow(10,(int)Math.floor(Math.log10(n)));
            return (r*l)+ reverse(n/10);
        }
    }
    static String reverse(String s)
    {
        if(s.length()==1)
        {
            return s.charAt(0)+"";
        }
        else
        {
            return s.charAt(s.length()-1)+ reverse(s.substring(0,s.length()-1));
        }
    }

    static int reverseRec(int n,int rev)
    {
        if(n==0)
        {
            return rev;
        }
        else
        {
            int r= n%10;
            rev= rev*10 +r;
            return reverseRec(n/10,rev);
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println("Factorial: "+factorial(5));
     System.out.println("Fibonacci: "+fib(10));
     System.out.println("Sum: "+sum(2));
     System.out.println("Digit Sum: "+ digitSum(123));
     System.out.println("Digit Product: "+ digitProduct(123));
     System.out.println("Reverse: "+ reverse(123));
     System.out.println("Reverse number using strings: "+ reverse(123));
     System.out.println("Reverse using Recursion: "+ reverseRec(123, 0));
     sc.close();
    }
}