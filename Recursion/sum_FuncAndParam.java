
public class sum_FuncAndParam {

    // Parametric Recursion
    static void sum(int i,int s)
    {
        if(i==0)
        {
            System.out.println("Sum: "+s);
            return;
        }
        s=s+i;
        // System.out.println("i: "+i+" s: "+s);
        sum(i-1,s);
    }

    // Functional Recursion
    static int add(int i)
    {
        if(i==0)
        {
            return 0;
        }
        int sum= i+add(i-1);
        // System.out.println(sum);
        return sum;
    }
    public static void main(String[] args){
        sum(10,0);

        System.out.println(add(10));
    }
}
