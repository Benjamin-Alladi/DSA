package Stack;

public class stackUsingLL {
    private Node head=null;
    int size=0;

    public boolean isEmpty()
    {
        return head==null;
    }

    // O(1)
    public void push(int d)
    {
        size++;
        Node n=new Node(d);
        if(head==null)
        {
            head=n;
            return;
        }

        n.next=head;
        head=n;
    }

    // O(1)
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        return head.data;
    }

    // O(1)
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Can't pop because stack is Empty!");
            return -1;
        }

        Node t=head;
        head=head.next;
        t.next=null;
        size--;

        return t.data;
    }

    // O(1)
    public int size()
    {
        return size;
    }

    // O(N)
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args)
    {
        stackUsingLL s=new stackUsingLL();

        System.out.println(s.isEmpty());

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        s.display();

        s.push(10);
        s.push(100);
        s.display();

        System.out.println("Size: "+s.size());
        System.out.println(s.pop());
        System.out.println("Size: "+s.size());
        s.display();

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println("Size: "+s.size());

        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.size());

        s.push(100);
        System.out.println(s.size());
        s.display();
    }
}
