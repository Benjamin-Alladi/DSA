class Node
{
    int data;
    Node next;
    Node(int d)
    {
        this.data=d;
        this.next=null;
    }
}
public class queueLL {
    private Node front=null,rear=null;
    private int size=0;

    public boolean isEmpty()
    {
        return front==null;
    }

    public void enqueue(int d)
    {
        Node n=new Node(d);
        size++;

        if(isEmpty())
        {
            front=rear=n;
            return;
        }
        rear.next=n;
        rear=n;
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return -1;
        }

        Node t=front;
        front=front.next;
        t.next=null;
        size--;
        if(front==null)
        {
            rear=null;
        }
        return t.data;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
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

        Node t=front;
        while(t!=null)
        {
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args)
    {
        queueLL q=new queueLL();

        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        q.display();
        System.out.println(q.peek());

        System.out.println("Size: "+q.size());
        System.out.println(q.dequeue());
        q.display();
        System.out.println("Size: "+q.size());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println(q.isEmpty());
        System.out.println("Size: "+q.size());
        q.display();
        q.dequeue();

        q.enqueue(100);
        System.out.println(q.peek());
        System.out.println("Size: "+q.size());
        q.display();
    }
}
