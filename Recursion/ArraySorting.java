import java.util.*;

class ArraySorting {

    static void sort(ArrayList<Integer> al,int n)
    {
        if(al.size()==0)
        {
            return;
        }

        // pop the last element
        int last=al.remove(al.size()-1);
        sort(al,n-1);

        insert(al,last);
    }

    static void insert(ArrayList<Integer> al,int last)
    {
        if(al.size()==0 || al.get(al.size()-1)<=last)
        {
            al.add(last);
            return;
        }

        // If the last element of sorted ArrayList is greater than the last element passed by sort() to insert() which is to be inserted then
        // remove it until we find the first smaller element so that we can insert the last next to it.
        int removed=al.remove(al.size()-1);
        insert(al,last);
        al.add(removed);
    }
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(5,1,2,5,2,4));
        sort(al,al.size());
        System.out.println(al);
    }
}
