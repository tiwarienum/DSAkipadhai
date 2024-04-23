public class BTree
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
    public Node newNode(int data,Node root){
        Node newnode=new Node(data);
        return newnode;
    }
    public int height(Node root){
        if(root==null)
            return 0;
        else{
            if(height(root.left)>height(root.right))
                return 1+height(root.left);
            else
                return 1+height(root.right);
        }
    }
    public void printlevel(int level,Node root){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else
            printlevel(level-1,root.left);
            printlevel(level-1,root.right);
    }
    public void display(Node root){
        int h=height(root);
        for(int i=1;i<=h;i++){
            for(int j=i;j<=h;j++)
                System.out.print("  ");
            printlevel(i,root);
            System.out.println();
        }
    }
    public static void main(String[]a){
        Main ob=new Main();
        Node root=null;
        root=ob.newNode(10,root);
        root.left=ob.newNode(20,root);
        root.right=ob.newNode(30,root);
        root.left.left=ob.newNode(40,root);
        root.left.right=ob.newNode(50,root);
        root.right.left=ob.newNode(60,root);
        root.right.right=ob.newNode(70,root);
        ob.display(root);
    }
}
