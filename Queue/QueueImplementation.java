package Queue;
//using array

public class QueueImplementation {
    static class Queue{
        int rear;
        int front;
        int arr[];
        int size;
    Queue(int size) {
        this.size=size;
        arr=new int[size];
        rear=-1;
        front=0;
    }
     boolean isEmpty(){
        return front>rear;
    }
    void add(int data){
        if(rear==size-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
        
    }
  int remove(){
        if(isEmpty()){
            System.out.println("quue is empty");
            return -1;
        }
        int value=arr[front];
        front++;
        return value;
    }
     int peek(){
         if(isEmpty()){
            System.out.println("quue is empty");
            return -1;
        }
        return arr[front];
    }   
}
public static void main(String[] args) {
    Queue q=new Queue(5);
    q.add(2);
    q.add(5);
    q.add(6);
    q.add(1);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }

    
    
}
}
