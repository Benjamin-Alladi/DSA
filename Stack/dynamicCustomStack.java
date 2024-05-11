package Stack;
import java.util.*;

// extending customStack class to use its functionality
public class dynamicCustomStack extends customStackArray{

    dynamicCustomStack()
    {
        super();
    }
    dynamicCustomStack(int size)
    {
        super(size);
    }

    // pop(), peek(), isFull(), isEmpty(),, size(), display() are same.
    // when pushing element into stack, if stack is full then double the size of array.
    // So, override push() method of customStack in dynamicCustomStack.

    public boolean push(int val)
    {
        // index==array.length-1;
        if(isFull())
        {
            // doubling the size of array.
            int[] temp=new int[2*array.length];
            for(int i=0;i<=index;i++)
            {
                temp[i]=array[i];
            }

            array=temp;
        }

        return super.push(val);
    }

    public static void main(String[] args) {
        dynamicCustomStack s=new dynamicCustomStack(3);

        System.out.println(s.isEmpty());
        System.out.println(s.push(1));
        s.push(2);
        s.push(10);

        System.out.println(s.size());
        System.out.println(s.isFull());
        s.display();

        System.out.println(s.push(100));
        System.out.println(s.isFull());
        System.out.println(s.size());
        s.display();
    }
}
