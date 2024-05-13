public class Fibonacci {

    // Iterative
    static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        int a=0,b=1,nextTerm=-1;
        int i=2;
        while(i<=n)
        {
            nextTerm=a+b;
            a=b;
            b=nextTerm;

            i++;
        }
        return nextTerm;
    }

    // Recursive
    static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        int last= fib(n-1);
        int slast= fib(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        
        System.out.println(fibonacci(6));

        System.out.println(fib(6));
    }
}
