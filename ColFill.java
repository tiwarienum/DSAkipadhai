import java.util.*;
public class ColFill
{
    public void solution(int arr[][],int oc,int nc,int x,int y){
        if(x<0 || x>4 || y<0 || y>4 || arr[x][y]!=oc)
            return;
        if(arr[x][y]==nc)
            return;
        arr[x][y]=nc;
        solution(arr,oc,nc,x-1,y);
        solution(arr,oc,nc,x,y+1);
        solution(arr,oc,nc,x,y-1);
        solution(arr,oc,nc,x+1,y);

    }
	public static void main(String []arg){
	       int arr[][]=new int[][]
	           {{0,0,1,0,0},
	            {0,0,1,0,0},
	            {1,1,1,1,1},
	            {0,0,1,0,0},
	            {0,0,1,0,0}
	       };
	       int oldcolor=1,newcolor=3,x=2,y=2;
	       Main ob=new Main();
	       ob.solution(arr,oldcolor,newcolor,x,y);
	       for(int i=0;i<5;i++){
	           for(int j=0;j<5;j++){
	               System.out.print(arr[i][j]+" ");
	           }
	           System.out.println();
	       }
	       
	}
}














