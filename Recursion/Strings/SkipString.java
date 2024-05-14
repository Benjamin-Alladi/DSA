package Strings;

// skip "in"
public class SkipString {

    // Parametric Recursion
    static void skipString(String s,String r)
    {
        if(s=="")
        {
            System.out.println(r);
            return;
        }

        if(!s.startsWith("in"))
        {
            r+=s.charAt(0);
            skipString(s.substring(1),r);
        }
        else
        {
            skipString(s.substring(2),r);
        }
    }

    // Functional Recursion
    static String skip(String s)
    {
        if(s=="")
        {
            return "";
        }
        
        String res="";
        if(!s.startsWith("in"))
        {
            res+= s.charAt(0)+skip(s.substring(1));
        }
        else
        {
            res= skip(s.substring(2));
        }
        return res;
    }
    public static void main(String[] args) {
        skipString("playing in rain","");
        skipString("singing","");

        System.out.println(skip("playing in rain"));
        System.out.println(skip("singing"));
    }
}
