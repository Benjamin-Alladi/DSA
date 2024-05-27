package StackRecursion;

import java.util.Stack;

public class MinimunElementStack {

    // Parametric Recursion
    static void func(Stack<Integer> s,int[] res)
    {
        if(s.isEmpty())
        {
            res[0]=Integer.MAX_VALUE;
            return;
        }

        int top=s.pop();
        func(s,res);

        res[0]=Math.min(res[0],top);
        s.push(top);
    }

    // Functional Recursion
    static int getMin(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return Integer.MAX_VALUE;
        }

        int min=s.pop();
        int newMin=getMin(s);

        s.push(min);
        return Math.min(min,newMin);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        // s.push(1);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(6);

        int[] res=new int[1];
        func(s,res);
        System.out.println("Minimum Element in Stack: "+res[0]);
        System.out.println(getMin(s));
    }
}
