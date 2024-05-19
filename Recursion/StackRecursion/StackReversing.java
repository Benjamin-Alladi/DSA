package StackRecursion;
import java.util.Stack;

public class StackReversing {

    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }

        int top=s.pop();
        reverse(s);
        insert(s,top);
    }

    static void insert(Stack<Integer> s,int top)
    {
        if(s.isEmpty())
        {
            s.push(top);
            return;
        }

        int popped= s.pop();
        insert(s,top);
        s.push(popped);
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
        reverse(s);
        System.out.println(s);
    }
}
