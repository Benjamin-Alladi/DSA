public class printNto1{

    // Recursion
    static void print(int i)
    {
        if(i==0)
        {
            return;
        }
        System.out.print(i+" ");
        print(i-1);
    }

    // BackTracking
    static void printer(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        printer(i+1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        print(5);

        System.out.println();
        printer(1,10);
    }
}
