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

        if(c<r)
        {
            System.out.print("*");
            print(r,c+1);
        }
        else
        {
            System.out.println();
            print(r-1,0);
        }
    }

    static void printer(int r,int c)
    {
        if(r>5)
        {
            return;
        }
        else
        {
            if(c<r)
            {
                printer(r,c+1);
                System.out.print("*");
                // System.out.print("*"+r+""+c);
            }
            else
            {
                printer(r+1,0);
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
     System.out.println("Reverse Triangle:");
     print(5,0);

     System.out.println("Reverse Triangle:");
     printer(1,0);
    }
}