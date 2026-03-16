package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class InsertAtFront{
    static Node insertBegining(Node head,int x){
        if(head==null){
            return new Node(x);
        }
        Node newnode=new Node(x);
        newnode.next=head;
        head=newnode;
        return head;
    }
    static void printll(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"--->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
       head= insertBegining(head, 30);
       printll(head);
       

        
        
    }
}