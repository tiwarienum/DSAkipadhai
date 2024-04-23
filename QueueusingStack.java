public class QueueusingStack
{
	int top=-1;
	int stack[]=new int[5];
	public void push(int data){
	    if(top==4){
	        System.out.print("Stack full");
	        return;
	    }
	    stack[++top]=data;
	}
	public int pop(){
	    if(top==-1){
	        System.out.print("Empty stack");
	        return -1;
	    }
	    int temp=stack[top];
	    top--;
	    return temp;
	}
	public void display(){
	    for(int i=top;i>=0;i--){
	        System.out.print(stack[i]+" ");
	    }
	}
	public int empty(){
	    if(top==-1){
	        return 0;
	    }
	    else{
	        return 1;
	    }
	}
	public static void main(String []args){
	    Main s1=new Main();
	    Main s2=new Main();
	    s1.push(10);
	    s1.push(20);
	    s1.push(30);
	    s1.push(40);
	    while(s1.empty()!=0){
	        s2.push(s1.pop());
	    }
	    while(s2.empty()!=0){
	        System.out.print(s2.pop()+" ");
	    }
	    
	}
	
}
