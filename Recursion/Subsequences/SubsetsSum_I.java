package Subsequences;
import java.util.*;

// list of subset sums
public class SubsetsSum_I {

    static void func(int index,int[] a,ArrayList<Integer> al,int sum,ArrayList<Integer> res)
    {
        if(index==a.length)
        {
            res.add(sum);
            return;
        }


        // take
        sum+=a[index];
        al.add(a[index]);
        func(index+1,a,al,sum,res);

        // not take
        sum-=al.get(al.size()-1);
        al.remove(al.size()-1);
        func(index+1,a,al,sum,res);
    }
    public static void main(String[] args) {
        int[] a={3,1,2};

        ArrayList<Integer> al=new ArrayList<>(), res=new ArrayList<>();
        int sum=0;
        func(0,a,al,sum,res);

        System.out.println(res);
    }
}
