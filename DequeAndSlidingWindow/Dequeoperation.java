package DequeAndSlidingWindow;
import java.util.Deque;
import java.util.LinkedList;

public class Dequeoperation {
    public static void main(String[] args) {
        Deque<Integer>d=new LinkedList<>();
        d.addFirst(10);
        d.addFirst(20);
        d.addLast(5);
        d.removeLast();
        d.removeFirst();
        d.addFirst(5);
        d.addLast(20);
        for(int ele:d){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Front: " + d.peekFirst());
System.out.println("Rear: " + d.peekLast());
    }
    
}
