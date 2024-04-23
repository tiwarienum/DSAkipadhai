import java.util.*;
class TwoLL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node insertEnd(int data,Node head){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }
        return head;    
    }
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[]a){
        Main ob=new Main();
        Node h1=null,h2=null;
        h1=ob.insertEnd(10,h1);
        h1=ob.insertEnd(20,h1);
        h1=ob.insertEnd(30,h1);
        h2=ob.insertEnd(11,h2);
        h2=ob.insertEnd(12,h2);
        h2=ob.insertEnd(13,h2);
        ob.display(h2);
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
