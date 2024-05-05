package LinkedList;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data =d;
        this.next=null;
    }
    Node(int d, Node n)
    {
        this.data=d;
        this.next=n;
    }
}

public class sll{

    static Node head,tail;

    void add(int d)
    {
        Node n= new Node(d);
        if(head==null)
        {
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        tail=n;
    }

    void insertFirst(int d)
    {
        Node n= new Node(d);
        n.next=head;
        if(head==null)
        {
            head=n;
            tail=n;
            return;
        }
        head=n;
    }

    void insertLast(int d)
    {
        if(head==null)
        {
            insertFirst(d);
        }

        Node t=head;
        while(t.next!=null)
        {
            t= t.next;
        }

        Node n= new Node(d);
        t.next=n;
        tail=n;
    }

    void insertAtIndex(int ind, int d)
    {
        if(ind==0)
        {
            insertFirst(d);
            // System.out.println("invoked");
            return;
        }

        Node t=head;
        int i=0;
        while(i<ind-1)
        {
            t=t.next;
            i++;
        }

        Node n= new Node(d);
        n.next=t.next;
        t.next=n;
    }

    void insertAfter(int ind,int d)
    {
        // insertAtIndex(ind+1, d);
        if(head==null)
        {
            insertFirst(d);
            return;
        }

        int i=0;
        Node t=head;
        while(i<ind)
        {
            t=t.next;
            i++;
        }

        Node n= new Node(d);
        n.next=t.next;
        t.next=n;
    }

    void deleteByIndex(int ind)
    {
        if(head==null)
        {
            return;
        }

        if(ind==0)
        {
            head=head.next;
            return;
        }

        int i=0;
        Node t=head;
        while(i<ind-1)
        {
            t=t.next;
            i++;
        }
        t.next= t.next.next;
    }

    void deleteByValue(int d)
    {
        if(head.data==d)
        {
            head=head.next;
            return;
        }

        Node t=head;
        while(t.next.data!=d)
        {
            t=t.next;
        }
        t.next=t.next.next;
    }

    void display()
    {
        Node t=head;

        while(t!=null)
        {
            System.out.print(t.data+" -> ");
            t=t.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public  static void main(String[] args) {
        sll s= new sll();

        s.add(10);
        s.add(20);
        s.insertFirst(10);
        s. add(100);
        s.insertFirst(1);
        s.insertLast(500);
        s.insertLast(1000);
        s.add(100);

        s.display();

        s.insertAtIndex(0, 20);
        s.display();
        s.insertAtIndex(1, 30);
        s.display();
        s.insertAtIndex(9, 5);
        s.display();
        s.insertAtIndex(11, 200);
        s.display();
        s.insertAtIndex(12, 10);
        s.display();

        s.insertAfter(0, 4);
        s.display();
        s.insertAfter(5, 6);
        s.display();
        s.insertAfter(14, 100);
        s.display();

        s.deleteByIndex(0);
        s.display();
        s.deleteByIndex(1);
        s.display();
        s.deleteByIndex(5);
        s.display();
        s.deleteByIndex(12);
        s.display();

        s.deleteByValue(10);
        s.display();
        s.deleteByValue(200);
        s.display();
        s.deleteByValue(4);
        s.display();
    }
}

