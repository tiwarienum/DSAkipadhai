import java.util.*;
public class ArrStack
{
    int top=-1;
    int stack[]=new int[5];
    int min=-1;
    public void push(int data){
        if(top==-1){
            min=data;
            stack[++top]=data;
        }
        else if(data<min){
            stack[++top]=2*data-min;
            min=data;
        }
        else{
            stack[++top]=data;
        }
    }
    public int pop(){
        if(stack[top]<min){
            int temp=min;
            min=2*min-stack[top--];
            return temp;
        }
        else{
            return stack[top--];
        }
    }
    public static void main(String []abc){
        Main ob=new Main();
        ob.push(2);
        ob.push(3);
        ob.push(1);
        System.out.println(ob.min);
        System.out.println(ob.pop());
        System.out.println(ob.min);
    }
}
  
