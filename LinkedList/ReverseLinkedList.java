package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class ReverseLinkedList {
    static Node reverse(Node head){
        Node curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    static void printll(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(3);
        head.next.next=new Node(2);
        head.next.next.next=new Node(7);
        printll(head);
        head=reverse(head);
        printll(head);
    }
    
    
}
