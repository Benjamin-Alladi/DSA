package Subsequences;
import java.util.*;

// Can take one element multiple times
public class CombinationSum_I{

    static void func(int index,int[] a,int target, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> res)
    {
        if(index==a.length)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(al));
            }
            return;
        }

        // take
        if(target>=a[index])
        {
            target-=a[index];
            al.add(a[index]);
            func(index,a,target,al,res);

            target+=al.get(al.size()-1);
            al.remove(al.size()-1);
        }

        // not take
        func(index+1,a,target,al,res);
    }
    public static void main(String[] args) {
        int[] a={2,3,1,7};

        int target=7;
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        func(0,a,target,al,res);

        System.out.println(res);
    }
}
