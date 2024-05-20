package StackRecursion;
import java.util.*;

class DeleteMiddle {

    static void deleteMiddle(Stack<Integer> s,int count)
    {
        if(count==0)
        {
            s.pop();
            return;
        }

        int top=s.pop();
        deleteMiddle(s, --count);
        s.push(top);
    }

    static void func(Stack<Integer> s,int count,int[] len)
    {
        if(s.isEmpty())
        {
            return;
        }

        count++;
        len[0]++;
        int top=s.pop();
        func(s,count,len);

        if(count==(len[0]/2)+1)
        {
            return;
        }
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(1);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(6);

        System.out.println(s);
        deleteMiddle(s,s.size()/2);
        System.out.println("After deleting Middle Element: "+s);


        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(1);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(6);

        System.out.println(st);
        func(st,0,new int[]{0});
        System.out.println("After deleting Middle Element: "+st);
    }
}
