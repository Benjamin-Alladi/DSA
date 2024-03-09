import java.util.*;

class trainglePattern{

    /*
    *****
    ****
    ***
    **
    *
    */
    static void print(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        else
        {
            if(c<r)
            {
                System.out.print("*");
                print(r,c+1);
            }
            else if(c==r)
            {
                System.out.println();
                print(r-1,0);
            }
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */
    static void printer(int r, int c)
    {
        // System.out.println(r+" "+c);
        if(r==0)
        {
            return;
        }

        else
        {
            if(c<r)
            {
                printer(r,c+1);
                System.out.print("*");
            }
            else
            {
                printer(r-1, 0);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println("Reverse Triangle:");
     print(5,0);

     System.out.println("Triangle:");
     printer(5,0);
     sc.close();
    }
}