package Implementation;
// import java.util.*;

public class customStackArray {
    protected int[] array;
    private static final int SIZE=10;
    int index=-1;

    customStackArray()
    {
        this(SIZE);
    }
    customStackArray(int size)
    {
        this.array=new int[size];
    }

    public boolean isEmpty()
    {
        return index==-1;
    }
    public boolean isFull()
    {
        return index==array.length-1;
    }

    public int size()
    {
        if(isEmpty())
        {
            return 0;
        }
        if(isFull())
        {
            return array.length;
        }
        return index+1;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return array[index];
    }

    public boolean push(int val)
    {
        if(isFull())
        {
            System.out.println("Value "+val+" can't be pushed because Stack is Full!");
            return false;
        }

        array[++index]=val;
        return true;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println(" Can't pop because Stack is Full!");
            return -1;
        }

        // int val=array[index];
        // index--;
        // return val;
        return array[index--];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }

        for(int i=0;i<=index;i++)
        {
            System.out.print(array[i]+"->");
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        customStackArray s=new customStackArray(6);
        
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());

        System.out.println(s.push(1));
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        s.display();

        System.out.println(s.isFull());
        s.push(10);

        System.out.println(s.pop());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.size());

        s.push(100);
        System.out.println(s.size());
    }
}
