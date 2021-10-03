import java.util.*;
public class dequene_eg {
    public static void main(String[] args) 
    {
        Deque<String> dq=new LinkedList<String>();

        dq.add("Element 1 (Tail)");
        dq.addFirst("Element 2 (Head)");
        dq.addLast("Element 3 (Tail)");
        dq.push("Element 4 (Head)");
        dq.offer("Element 5 (Tail)");
        dq.offerFirst("Element 6 (Head)");

        System.out.println(dq + "\n");

        dq.removeFirst();
        dq.removeLast();
    }
    
}
