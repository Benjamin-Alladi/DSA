package Maths;

public class sqrt {

    static int sqrt(int n)
    {
        int l=1,h=n/2;

        while(l<=h)
        {
            int m= (l+h)>>1;

            if(m*m==n)
            {
                return m;
            }
            else if(m*m>n)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return h;
    }
    public static void main(String[] args)
    {
        System.out.println(sqrt(25));
    }
}
