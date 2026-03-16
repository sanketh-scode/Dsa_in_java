package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteSpecific {
    public static Node delete(Node head,int x){
        Node temp=head;
        if(x==1){
            head=head.next;
            temp=null;
            return head;
        }
        Node prev=temp;
        for(int i=1;i<x&&temp!=null;i++){
            prev=temp;
            temp=temp.next;

        }
        prev.next=temp.next;
        return head;

    }
    static void printll(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    
}
public static void main(String[] args) {
    Node head=new Node(10);
    head.next=new Node(2);
    head.next.next=new Node(30);
    int x=3;
   head= delete(head, x);
    printll(head);
}
}