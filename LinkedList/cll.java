package LinkedList;
import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data=d;
    }
    Node(int d,Node n)
    {
        data=d;
        next=n;
        // System.out.println(d+" "+next);
    }
}
public class cll {

    static private Node head,tail;

    static void add(int d)
    {
        Node n= new Node(d);
        if(head==null)
        {
            n.next=n;
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        tail=n;
        tail.next=head;
    }

    static void insertFirst(int d)
    {
        if(head==null)
        {
            add(d);
            return;
        }

        Node t= new Node(d);
        t.next=head;
        head=t;
        tail.next=head;
    }

    static void insertLast(int d)
    {
        if(head==null)
        {
            add(d);
            return;
        }

        Node t= new Node(d);
        tail.next=t;
        tail=t;
        tail.next=head;
    }

    static void display()
    {
        Node t=head;
        do
        {
            System.out.print(t.data+"->");
            t=t.next;
        }while(t!=head);

        System.out.print("null\n");
    }
    public static void main(String[] args) {
        cll c= new cll();

        c.add(10);
        c.display();
        c.add(20);
        c.add(40);
        c.add(5);


        c.insertFirst(100);
        c.display();
        c.insertFirst(1);
        c.display();


        c.insertLast(200);
        c.display();
        c.insertLast(600);
        c.display();
    }
}
