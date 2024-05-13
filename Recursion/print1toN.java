
public class print1toN{

    // Recursion
    static void print(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.print(i+" ");
        print(i+1,n);
    }

    // BackTracking
    static void printer(int i)
    {
        if(i==0)
        {
            return;
        }
        printer(i-1);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        print(1,5);

        System.out.println();
        printer(10);
    }
}
