import java.util.*;
class nthNodeLast{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void insert(int data){
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
    public int count(int c){
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
    public int nthNode(int n){
        Node temp=head;
        while(n>1){
            temp=temp.next;
            n--;
        }
        return temp.data;
    }
    public static void main(String []abc){
        Main ob=new Main();
        ob.insert(10);ob.insert(20);ob.insert(30);
        ob.insert(40);ob.insert(50);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:- ");
        int n=sc.nextInt();
        int count=0;
        count=ob.count(count);
        if(n>count){
            System.out.print("no such node");
        }
        else{
            n=count-n+1;
            System.out.print(ob.nthNode(n));
        
        }
    }
    }
