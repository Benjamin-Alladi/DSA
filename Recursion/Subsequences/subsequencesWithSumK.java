package Subsequences;
import java.util.*;

class subsequencesWithSumK{

    static void func(int ind,int[] a,ArrayList<Integer> al,int sum,int targetSum)
    {
        if(ind==a.length)
        {
            if(sum==targetSum)
            {
                System.out.println(al);
            }
            return;
        }

        sum+=a[ind];
        al.add(a[ind]);
        func(ind+1,a,al,sum,targetSum);

        sum-=al.get(al.size()-1);
        al.remove(al.size()-1);
        func(ind+1,a,al,sum,targetSum);
    }
    public static void main(String[] args) {
        int[] a={1,2,1};

        int targetSum=2;
        func(0,a,new ArrayList<>(),0,targetSum);
    }
}
