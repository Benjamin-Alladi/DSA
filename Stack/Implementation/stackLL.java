package Implementation;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        this.data=d;
    }
}

// pop(): O(N)
public class stackLL {
    private Node head=null,tail=null;
    private int size=0;

    public boolean isEmpty()
    {
        return head==null;
    }

    public void push(int d)
    {
        Node n=new Node(d);
        size++;
        if(head==null)
        {
            head=tail=n;
            return;
        }
        tail.next=n;
        tail=n;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return tail.data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Can't pop because Stack is Empty!");
            return -1;
        }

        if(head.next==null)
        {
            int val=head.data;
            head=null;
            size--;
            return val;
        }

        Node t=head,prev=null;
        while(t.next!=null)
        {
            prev=t;
            t=t.next;
        }
        tail=prev;
        size--;
        tail.next=null;

        return t.data;
    }

    public int size()
    {
        return size;
    }

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

    public static void main(String[] args) {

        stackLL s=new stackLL();
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
