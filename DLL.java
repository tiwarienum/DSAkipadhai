public class DLL
{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    public void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public void insertFront(int data){
        Node newNode=new Node(data);
        Node temp=head;
        newNode.next=temp;
        temp.prev=newNode;
        head=newNode;
    }
    public void insertPosition(int data,int pos){
        Node newNode=new Node(data);
        Node temp1=head;
        while(pos>1){
            temp1=temp1.next;
            pos--;
        }
        Node temp2=temp1.next;
        temp1.next=newNode;
        newNode.next=temp2;
        temp2.prev=newNode;
        newNode.prev=temp1;
    }
    public void deleteFront(){
        Node temp=head;
        head=temp.next;
        temp=null;
        temp=head;
        temp.prev=null;
    }
    public void deleteEnd(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;
    }
    public void deletePosition(int pos){
        Node temp=head;
        while(pos>1){
            temp=temp.next;
            pos--;
        }
        Node temp2=temp.next;
        temp.next=temp2.next;
        temp2=temp2.next;
        temp=temp2.prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String []abc){
        Main ob=new Main();
        ob.insertEnd(10);
        ob.insertEnd(20);
        ob.insertEnd(30);
        ob.deleteFront();
        ob.display();
    }
}
 
