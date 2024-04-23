import java.util.*;
class BasicLL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void insertFront(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void deleteFront(){
        Node temp=head;
        head=temp.next;
        temp=null;
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
    }
    public void deletePosition(int pos){
        Node temp1=head;
        while(pos>1){
            temp1=temp1.next;
            pos--;
        }
        Node temp2=temp1.next;
        temp1.next=temp2.next;
        temp2=null;
    }
    public void deleteEnd(){
        Node temp1=head;
        Node temp2=temp1.next;
        while(temp2.next!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.next=null;
        temp2=null;
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
        ob.insertFront(30);
        ob.insertFront(40);
        int index=2;
        ob.insertPosition(50,index);
        ob.deleteFront();
        ob.display();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
