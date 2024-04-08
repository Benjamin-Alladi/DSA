package String;

public class SkipChar {

    static String skipChar(String s,char ch)
    {
        if(s.length()==0)
        {
            return "";
        }
        else
        {
            char c= s.charAt(0);

            if(c==ch)
            {
                s= s.substring(1);
                return skipChar(s,ch);
            }
            else
            {
                return c+ skipChar(s.substring(1),ch);
            }
        }
    }
    public static void main(String[] args) {
        String r= skipChar("Dining Drinking",'n');
        System.out.println(r);
    }
}
