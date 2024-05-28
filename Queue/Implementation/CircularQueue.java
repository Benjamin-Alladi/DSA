public class CircularQueue {
    int[] q;
    int front=-1,rear=-1,count=0;

    CircularQueue()
    {
        q=new int[6];
    }
    CircularQueue(int size)
    {
        q=new int[size];
    }

    public void enqueue(int val)
    {
        if(count==q.length)
        {
            System.out.println("Cant Enqueue because Queue is Full!");
            return;
        }

        rear=(rear+1)%q.length;
        q[rear]=val;
        count++;
        if(count==1)
        {
            front=0;
        }
    }

    public int dequeue()
    {
        if(count==0)
        {
            System.out.println("Cant Dequeue because Queue is Empty!");
            return -1;
        }

        count--;
        int val=q[front];
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front=(front+1)%q.length;
        }
        return val;
    }

    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return q[front];
    }

    public boolean isEmpty()
    {
        return count==0;
    }

    public boolean isFull()
    {
        return count==q.length;
    }

    /*
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty!");
            return;
        }

        if(front<=rear)
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(q[i]+"<-");
            }
            System.out.println("End");
        }
        else
        {
            for(int i=front;i<q.length;i++)
            {
                System.out.print(q[i]+"<-");
            }
            for(int i=0;i<=rear;i++)
            {
                System.out.print(q[i]+"<-");
            }
            System.out.println("End");
        }
    }
    */

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty!");
            return;
        }

        for(int i=0;i<count;i++)
        {
            System.out.print(q[(front+i)%q.length] +"<-");
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        
        CircularQueue q=new CircularQueue();

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
