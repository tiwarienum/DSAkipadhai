public class isMirroredBST
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
    public boolean solution(Node r1,Node r2){
        if(r1==null && r2==null)
            return true;
        if(r1==null || r2==null)
            return false;
        else
            if(r1.data==r2.data){
                return solution(r1.right,r2.left) &&
                    solution(r1.left,r2.right);
            }
            return false;
    }
    public static void main(String[]a){
        Main ob=new Main();
        Node r1=null,r2=null;
        r1=ob.newNode(10,r1);
        r2=ob.newNode(10,r2);
        r1.left=ob.newNode(20,r1);
        r2.right=ob.newNode(20,r2);
        r1.right=ob.newNode(30,r1);
        r2.left=ob.newNode(30,r2);
        r1.left.left=ob.newNode(40,r1);
        r2.right.right=ob.newNode(50,r2);
        if(ob.solution(r1,r2)==true)
            System.out.print("mirrored");
        else
            System.out.print("not mirroted");
    }
}
