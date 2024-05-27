package StackRecursion;

import java.util.Stack;

public class MaximumElementStack {

    // Parametric Recursion
    static void func(Stack<Integer> s,int[] res)
    {
        if(s.isEmpty())
        {
            res[0]=Integer.MIN_VALUE;
            return;
        }

        int top=s.pop();
        func(s,res);

        res[0]=Math.max(res[0],top);
        s.push(top);
    }

    // Functional Recursion
    static int getMax(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return Integer.MIN_VALUE;
        }

        int max=s.pop();
        int newMax= getMax(s);

        s.push(max);
        return Math.max(max,newMax);
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
        System.out.println("Maximum Element in Stack: "+res[0]);
        System.out.println(getMax(s));
    }
}
