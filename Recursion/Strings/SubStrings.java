package Strings;
import java.util.*;

class SubStrings{

    static void func(int index,String str,String ss,ArrayList<String> res)
    {
        if(index==str.length())
        {
            res.add(ss);
            return;
        }

        // take
        func(index+1,str,ss+str.charAt(index),res);

        // not take
        func(index+1,str,ss,res);
    }

    static void f(String str,String ss,ArrayList<String> res)
    {
        if(str=="")
        {
            res.add(ss);
            return;
        }
        // take
        f(str.substring(1),ss+str.charAt(0),res);

        // not take
        f(str.substring(1),ss,res);
    }
    public static void main(String[] args){

        String str="abc";
        ArrayList<String> res=new ArrayList<>();
        func(0,str,"",res);
        System.out.println(res);

        str="abc";
        ArrayList<String> r=new ArrayList<>();
        func(0,str,"",r);
        System.out.println(r);
    }
}
