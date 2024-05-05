package Stack;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        // push():
        s.push(1);
        s.push(2);
        s.push(3);
        // add():
        s.add(10);
        s.add(0,100);
        System.out.println(s);


        // peek():
        System.out.println("Peek: "+s.peek());
        // lastElement():
        System.out.println(s.lastElement());


        // pop():
        System.out.println("Pop: "+s.pop());
        System.out.println(s);

        // removeElement():
        System.out.println(s.removeElement(100));
        System.out.println("After removing: "+s);

        // isEmpty() and empty():
        System.out.println(s.isEmpty());
        System.out.println(s.empty());

        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s);
        System.out.println(s.indexOf(3)+" "+ s.indexOf(4)+" "+s.indexOf(10));
        System.out.println(s.lastIndexOf(3)+" "+ s.lastIndexOf(4)+" "+s.lastIndexOf(10));

        s.clear();
        System.out.println(s);
    }
}
