package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LengthOfList {
    static void length(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            count++;
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("length: "+count);
    }
    public static void main(String[] args) {
         Node head=new Node(10);
     head.next=new Node(20);
     head.next.next=new Node(30);
     head.next.next.next=new Node(40);
     length(head);

        
    }
    
}
