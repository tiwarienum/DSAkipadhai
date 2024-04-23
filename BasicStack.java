import java.util.*;
public class BasicStack
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
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    public int empty(){
        if(top==-1){
            return 0;
        }
        else{
            return 1;
        }
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]);
        }
    }
    public static void main(String []a){
        Main s=new Main();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.display();
    }
}
