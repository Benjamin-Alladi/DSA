package Queue.Implementation;

public class customQueue {

    private int[] q;
    private int front=-1,rear=-1,size=6;
    customQueue()
    {
        q=new int[size];
    }
    customQueue(int size)
    {
        this.size=size;
        q=new int[size];
    }

    public void enqueue(int val)
    {
        if(rear==q.length-1)
        {
            System.out.println("Cant Enqueue "+val+" because Queue is Full!");
            return;
        }

        q[++rear]=val;
        if(rear==0)
        {
            front++;
        }
    }

    public int dequeue()
    {
        if(front==-1)
        {
            System.out.println("Cant Dequeue because Queue is Empty!");
            return -1;
        }

        int val=q[front++];
        if(front==q.length)
        {
            front=rear=-1;
        }
        return val;
    }

    public int peek()
    {
        if(front==-1)
        {
            return -1;
        }
        return q[front];
    }

    public void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty!");
            return;
        }

        for(int i=front;i<=rear;i++)
        {
            System.out.print(q[i]+"<-");
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        
        customQueue q=new customQueue();

        System.out.println("Peak: "+q.peek());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println("Peak: "+q.peek());
        q.enqueue(7);
        q.enqueue(8);

        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println("Peak: "+q.peek());
        q.display();

        q.enqueue(1000);
        q.enqueue(1);
        q.enqueue(10);
        q.enqueue(100);

        q.display();

        System.out.println(q.peek());
        System.out.println(q.dequeue());

        q.display();
    }
}
