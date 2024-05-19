package Subsequences;
import java.util.*;

class printSubsequences{

    static void func(int ind,int[] a, ArrayList<Integer> al)
    {
        if(ind==a.length)
        {
            System.out.println(al);
            return;
        }

        // Take the element at index "i"
        al.add(a[ind]);
        func(ind+1,a,al);

        // Not take the element at index "i"
        al.remove(al.size()-1);
        func(ind+1,a,al);
    }
    public static void main(String[] args) {

        int[] a={3,1,2};
        ArrayList<Integer> al=new ArrayList<>();
        func(0,a,al);
    }
}
