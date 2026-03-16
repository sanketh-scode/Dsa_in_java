package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DeleteFirst{
     static Node delete(Node head){
        if(head==null){
            System.out.println("LL is empty");
            return null;
        }
        Node temp=head;
        head=head.next;
        temp=null;
        
        return head;
    }
    static void pritnll(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        pritnll(head);
        
        head=delete(head);
        pritnll(head);
    }
}
