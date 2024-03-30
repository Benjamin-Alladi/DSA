public class reverseTriangle {
    /*
     *
     **
     ***
     ****
     *****
     */
    static void pp(int r,int c)
    {
        if(r>5)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            pp(r,c+1);
        }
        else
        {
            System.out.println();
            pp(r+1,0);
        }
    }
    static void print(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            print(r,c+1);
            System.out.print("*");
            // System.out.print("*"+r+""+c);
        }
        else
        {
            print(r-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
     System.out.println("Triangle:");
     pp(1,0);

     System.out.println("Triangle:");
     print(5,0);
    }
}
