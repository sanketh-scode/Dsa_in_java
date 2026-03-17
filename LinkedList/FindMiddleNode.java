package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class FindMiddleNode {
    public static int findMidle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(3);
        head.next.next=new Node(2);
        head.next.next.next=new Node(7);
        System.out.println("midlle node is "+findMidle(head));
    }
    
}
