package Subsequences;
import java.util.*;

public class SubsetsSum_II {

    static void func(int index,int[] a,int sum,ArrayList<Integer> al,HashSet<Integer> res)
    {
        if(index==a.length)
        {
            res.add(sum);
            return;
        }

        // take
        sum+=a[index];
        al.add(a[index]);
        func(index+1,a,sum,al,res);

        // not take
        sum-=al.get(al.size()-1);
        al.remove(al.size()-1);
        func(index+1, a, sum, al, res);
    }

    static void f(int index,int[] a,int sum,HashSet<Integer> res)
    {
        if(index==a.length)
        {
            res.add(sum);
            return;
        }

        // take
        f(index+1,a,sum+a[index],res);

        // not take
        f(index+1,a,sum,res);
    }
    public static void main(String[] args) {
        int[] a={3,1,2};

        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> res=new HashSet<>();
        func(0,a,0,al,res);
        System.out.println(res);

        
        HashSet<Integer> h=new HashSet<>();
        f(0,a,0,h);
        System.out.println(h);
    }
}
