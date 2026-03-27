package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseKQueue{
   
    static void reverse(Queue<Integer> q,int k){
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        reverse(q,2);
    }
    }
