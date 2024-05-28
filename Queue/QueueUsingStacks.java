package Queue;
import java.util.*;

public class QueueUsingStacks {

    Stack<Integer> s,ss;
    public QueueUsingStacks(){
        s=new Stack<>();
        ss=new Stack<>();
    }
    
    public void push(int x) {
        while(!s.isEmpty())
        {
            ss.push(s.pop());
        }
        s.push(x);
        while(!ss.isEmpty())
        {
            s.push(ss.pop());
        }
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */