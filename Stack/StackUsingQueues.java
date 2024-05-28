import java.util.*;
public class StackUsingQueues {
    
    Queue<Integer> q,sq;
    public StackUsingQueues(){
        q=new LinkedList<>();
        sq=new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q.isEmpty())
        {
            sq.add(q.remove());
        }
        q.add(x);
        while(!sq.isEmpty())
        {
            q.add(sq.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}