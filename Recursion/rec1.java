import java.util.*;

class Test{
    static void ff(int c)
    {
        if(c==0)
        {
            return;
        }
        System.out.println("Hello! "+c);
        ff(c-1);
    }

    static void fr(int c)
    {
        if(c==0)
        {
            return;
        }
        else
        {
            fr(c-1);
            System.out.println("Hello! "+c);
        }
    }

    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     ff(5);
     fr(5);
     sc.close();
    }
}