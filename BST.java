public class BST
{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
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
        return root;
    }
    public int minimum(Node root){
        if(root.left==null)
            return root.data;
        return minimum(root.left);
    }
    public int maximum(Node root){
        if(root.right==null)
            return root.data;
        return maximum(root.right);
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            if(height(root.left)>height(root.right))
                return 1+height(root.left);
            else
                return 1+height(root.right);
        }
    }
    public void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void postorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data);
    }
    public void preorder(Node root){
        if(root==null)
            return;
        System.out.print(root.data);
        inorder(root.left);
        inorder(root.right);
    }
    public void printlevel(int level,Node root){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else{
            printlevel(level-1,root.left);
            printlevel(level-1,root.right);
        }
    }
    public void level(Node root){
        int h=height(root);
        for(int i=1;i<=h;i++){
            for(int j=i;j<=h;j++)
                System.out.print(" ");
            printlevel(i,root);
            System.out.println();
        }
    }
    public static void main(String []a){
        Node root=null;
        Main ob=new Main();
        root=ob.insert(10,root);
        root=ob.insert(7,root);
        root=ob.insert(5,root);
        //root=ob.insert(2,root);
        root=ob.insert(8,root);
        root=ob.insert(13,root);
        root=ob.insert(11,root);
        root=ob.insert(14,root);
        //System.out.print(ob.maximum(root)+" "+ob.minimum(root));
        //System.out.print(ob.height(root)-1);
        //ob.inorder(root);
        ob.level(root);
    }
}














