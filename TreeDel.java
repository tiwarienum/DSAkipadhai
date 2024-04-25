public class TreeDel
{
    class Node{
        int data;
        Node left;
        Node right;
        int height;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            this.height=1;
        }
    }
    public Node insert(int data,Node root){
        if(root==null){
            Node newNode=new Node(data);
            return newNode;
        }
        else if(data<root.data){
            root.left=insert(data,root.left);
        }
        else if(data>root.data){
            root.right=insert(data,root.right);
        }
        int l=1+getheight(root.left);
        int r=1+getheight(root.right);
        if(l>r){
            root.height=l;
        }
        else{
            root.height=r;
        }
        int balance=getbalance(root);
        if(balance>1){
            if(data<root.left.data){
                root=rightrotate(root);
            }
            else{
                root.left=leftrotate(root.left);
                root=rightrotate(root);
            }
        }
        else if(balance<-1){
            if(data>root.right.data){
                root=leftrotate(root);
            }
            else{
                root.right=rightrotate(root.right);
                root=leftrotate(root);
            }
        }
        return root;
    }
    public int getheight(Node root){
        if(root==null){
            return 0;
        }
        else{
            return root.height;
        }
    }
    public int getbalance(Node root){
        if(root==null){
            return 0;
        }
        else{
            int l=1+getheight(root.left);
            int r=1+getheight(root.right);
            return l-r;
        }
    }
    public Node rightrotate(Node root){
        Node t1=root.left;
        Node t2=t1.right;
        root.left=t2;
        t1.right=root;
        int l=1+getheight(root.left);
        int r=1+getheight(root.right);
        if(l>r){
            root.height=l;
        }
        else{
            root.height=r;
        }
        return t1;
    }
    public Node leftrotate(Node root){
        Node t1=root.right;
        Node t2=t1.left;
        root.right=t2;
        t1.left=root;
        int l=1+getheight(root.left);
        int r=1+getheight(root.right);
        if(l>r){
            root.height=l;
        }
        else{
            root.height=r;
        }
        return t1;
    }
    public void display(Node root){
        if(root==null){
            return;
        }
        display(root.left);
        System.out.print(root.data);
        display(root.right);
    }
    public int printheight(Node root){
        if(root==null){
            return 0;
        }
        else{
            return root.height;
        }
    }
    public Node deleteNode(int data,Node root){
        if(root==null){
            return null;
        }
        else if(data<root.data){
            root.left=deleteNode(data,root.left);
        }
        else if(data>root.data){
            root.right=deleteNode(data,root.right);
        }
        else{
            if(root.left==null){
                Node temp=root.right;
                root=null;
                return temp;
            }
            else if(root.right==null){
                Node temp=root.left;
                root=null;
                return temp;
            }
            else{
                Node t1=root;
                Node t2=t1.right;
                while(t2.left!=null){
                    t1=t2;
                    t2=t2.left;
                }
                root.data=t2.data;
                if(root==t1){
                    t1.right=t2.right;
                }
                else{
                    t1.left=t2.right;
                }
                return root;
            }
        }
        return root;
    }
	public static void main(String[] args) {
		Main ob=new Main();
		Node root=null;
		root=ob.insert(10,root);
		root=ob.insert(9,root);
	    root=ob.insert(8,root);
		root=ob.insert(7,root);
		root=ob.insert(6,root);
		root=ob.insert(5,root);
		root=ob.insert(4,root);
		root=ob.insert(3,root);
	//	System.out.print("Height: "+ob.printheight(root));
		ob.deleteNode(9,root);
		ob.display(root);
	}
}































