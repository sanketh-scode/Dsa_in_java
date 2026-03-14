package LinkedList;



public class LinkedListTraversal {
    Node head;
  static  class Node{
        int data;
        Node next;
    
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
    public static void traverasal(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("Null");

        }
    }
    public static void main(String[] args) {
     Node head=new Node(10);
     head.next=new Node(20);
     head.next.next=new Node(30);
     head.next.next.next=new Node(40);
     traverasal(head);

        }
    
}

