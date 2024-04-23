class Main{
    class printListfrontback{
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
        if(head==null)
            head=newNode;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String []a){
        Main ob=new Main();
        ob.insertEnd(10);
        ob.insertEnd(20);
        ob.insertEnd(30);
        ob.insertEnd(40);
        ob.insertEnd(50);
        ob.display();
    }}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
