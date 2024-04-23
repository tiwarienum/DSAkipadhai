import java.util.*;
public class ExpEval
{
    int top=-1;
    char stack[]=new char[5];
    public void push(char data){
        if(top==4){
            System.out.print("Stack full");
            return;
        }
        stack[++top]=data;
    }
    public char pop(){
        if(top==-1){
            System.out.print("Empty stack");
            return (char)-1;
        }
        return stack[top--];
    }
    public char peek(){
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
    public int pre(char a){
        switch(a){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default: return -1;
        }
    }
    public static void main(String []a){
        Main s1=new Main();
        String sol="";
        Scanner sc=new Scanner(System.in);
        String exp=sc.next();  //3+4
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)>='0' && exp.charAt(i)<='9'){
                sol+=exp.charAt(i);
            }
            else{
                if(exp.charAt(i)=='+'){
                    while(s1.empty()!=0 && s1.pre(s1.peek())>=s1.pre(exp.charAt(i))){
                        sol+=s1.pop();
                    }
                    s1.push(exp.charAt(i));
                }
                else if(exp.charAt(i)=='*'){
                    while(s1.empty()!=0 && s1.pre(s1.peek())>=s1.pre(exp.charAt(i))){
                        sol+=s1.pop();
                    }
                    s1.push(exp.charAt(i));
                }
                else if(exp.charAt(i)=='/'){
                    while(s1.empty()!=0 && s1.pre(s1.peek())>=s1.pre(exp.charAt(i))){
                        sol+=s1.pop();
                    }
                    s1.push(exp.charAt(i));
                }
                else if(exp.charAt(i)=='-'){
                    while(s1.empty()!=0 && s1.pre(s1.peek())>=s1.pre(exp.charAt(i))){
                        sol+=s1.pop();
                    }
                    s1.push(exp.charAt(i));
                }
                else if(exp.charAt(i)=='('){
                    s1.push(exp.charAt(i));
                }
                else if(exp.charAt(i)==')'){
                    while(s1.empty()!=0 && s1.peek()!='('){
                        sol+=s1.pop();
                    }
                    s1.pop();
                }
            }
        }
        while(s1.empty()!=0){
            sol+=s1.pop();
        }
        System.out.println("Postfix:- "+sol);
        for(int i=0;i<sol.length();i++){
            if(sol.charAt(i)>='0' && sol.charAt(i)<='9'){
                s1.push(sol.charAt(i));
            }
            else{
                int v1=(int)s1.pop()-48;
                int v2=(int)s1.pop()-48;
                if(sol.charAt(i)=='+'){
                    s1.push((char)(v2+v1+48));
                }
                else if(sol.charAt(i)=='-'){
                    s1.push((char)(v2-v1+48));
                }
                else if(sol.charAt(i)=='*'){
                    s1.push((char)(v2*v1+48));
                }
                else if(sol.charAt(i)=='/'){
                    s1.push((char)(v2/v1+48));
                }
            }
        }
        System.out.print("Solution:- "+s1.pop());
    }

}








