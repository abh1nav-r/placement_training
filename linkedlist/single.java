public class single {
    Node head;
    Node temp=head;
    Node tail;
    void inseratbeg(int data){
        Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
    }
    void insertatend(int data){
        Node newnode=new Node(data);
            tail.next=newnode;
            tail=newnode;
    }
    void insertatpos(int data,int pos){
        Node newnode=new Node(data);
        temp=head;
            for(int i=1;i<pos-1 && temp!=null;i++){
                temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void traverse(){
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        single onj=new single();
        onj.inseratbeg(10);
        onj.inseratbeg(20);
        onj.inseratbeg(30);
        onj.insertatend(40);
        onj.traverse();
    }
}
