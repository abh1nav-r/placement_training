import java.util.LinkedList;
public class singly_linkedlist {
    private Node head;
    private Node tail;

    void insertatbeg(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        
        if(tail==null){
            tail=newnode;
        }
    }
    void traverse(){
        if(head==null){
            return;
        }
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void insertatend(int data){
            Node newnNode=new Node(data);
            tail.next=newnNode;
            tail=newnNode;
    }
    void insertatpos(int data,int pos){
        Node newNode=new Node(data);
        while (head==null) {
            insertatbeg(data);
        }
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        int curr=1;
        Node temp=head;
        while(curr<pos-1){
            temp=temp.next;
            curr++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
        
    public static void main(String[] args) {
        LinkedList <Integer> link=new LinkedList<>();
        singly_linkedlist obj=new singly_linkedlist();
        obj.insertatbeg(50);
        obj.insertatbeg(20);
        obj.insertatbeg(30);
        obj.insertatbeg(40);
        obj.traverse();
        obj.insertatpos(100, 1);
        obj.traverse();
    }
}
