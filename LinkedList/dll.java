package LinkedList;

class dnode
{
    int data;
    dnode prev,next;

    dnode(int d)
    {
        data=d;
    }
}

public class dll {

    private static dnode head,tail;

    void insert(int d)
    {
        dnode n= new dnode(d);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    void insertFirst(int d)
    {
        if(head==null)
        {
            insert(d);
            return;
        }
        dnode n= new dnode(d);
        n.next=head;
        head.prev=n;
        head=n;
    }

    void insertLast(int d)
    {
        if(head==null)
        {
            insert(d);
            return;
        }
        dnode n= new dnode(d);
        n.prev=tail;
        tail.next=n;
        tail=n;
    }

    void insertAtIndex(int ind,int d)
    {
        if(ind==0)
        {
            insertFirst(d);
            return;
        }
        dnode t= getNode(ind-1);

        dnode n= new dnode(d);
        n.prev=t;
        n.next=t.next;
        if(t.next!=null)
        {
            t.next.prev=n;
        }
        t.next=n;
    }

    void insertAfterIndex(int ind,int d)
    {

    }

    dnode getNode(int ind)
    {
        dnode t=head;
        int i=0;

        while(i<ind)
        {
            i++;
            t=t.next;
        }
        return t;
    }

    void display()
    {
        dnode t=head;
        while(t!=null)
        {
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
    
        dll d= new dll();

        d.insert(10);
        d.insert(20);
        d.display();

        d.insertFirst(1);
        d.display();

        d.insertLast(100);
        d.display();

        d.insertAtIndex(0, 5);
        d.display();
        d.insertAtIndex(3, 16);
        d.display();
        d.insertAtIndex(6, 200);
        d.display();


    }
}
