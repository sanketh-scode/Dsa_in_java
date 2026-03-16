package LinkedList;
 class  Node {
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }
    
}

public class InsertAtEnd {
    static Node insertEnd(Node head,String x){
        if(head==null){
            return new Node(x);
            
        }
        Node newNod=new Node(x);
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
            
        }
        temp.next=newNod;
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
        Node head=new Node("hi");
        head.next=new Node("my name is");
        printll(head);
        head=insertEnd(head, "sanketh");
        printll(head);
    }
}
