import java.util.*;
class MergeSortedLists{
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
    public Node merge(Node h1,Node h2,Node h3){
        while(h1!=null && h2!=null){
            if(h1.data<h2.data){
                h3=insertEnd(h1.data,h3);
                h1=h1.next;
            }
            else{
                h3=insertEnd(h2.data,h3);
                h2=h2.next;
            }
        }
        while(h1!=null){
            h3=insertEnd(h1.data,h3);
            h1=h1.next;
        }
        while(h2!=null){
            h3=insertEnd(h2.data,h3);
            h2=h2.next;
        }
        return h3;
    }
    public static void main(String[]a){
        Main ob=new Main();
        Node h1=null,h2=null,h3=null;
        h1=ob.insertEnd(10,h1);
        h1=ob.insertEnd(20,h1);
        h1=ob.insertEnd(30,h1);
        h2=ob.insertEnd(11,h2);
        h2=ob.insertEnd(12,h2);
        h2=ob.insertEnd(13,h2);
        h3=ob.merge(h1,h2,h3);
        ob.display(h3);
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
