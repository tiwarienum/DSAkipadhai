public class RatInAMaze	
{
    public int safe(int arr[][],int row,int column){
        if(row<0 || column<0 ||row>3 || column>3 || arr[row][column]==0){
            return 0;
        }
        return 1;
    }
    public int solution(int arr[][],int sol[][],int row,int column){
        if(row==3 && column==3 && arr[row][column]==1){
            sol[row][column]=1;
            return 1;
        }
        if(safe(arr,row,column)==1){
            sol[row][column]=1;
            if(solution(arr,sol,row,column+1)==1){
                return 1;
            }
            if(solution(arr,sol,row+1,column)==1){
                return 1;
            }
        
        sol[row][column]=0;
        }
        return 0;
    }
	public static void main(String[] args) {
		int arr[][]={{1,1,1,1},
		             {1,0,0,1},
		             {1,1,0,0},
		             {0,1,1,1}};
		int sol[][]={{0,0,0,0},
		             {0,0,0,0},
		             {0,0,0,0},
		             {0,0,0,0}};
		Main ob=new Main();
		if(ob.solution(arr,sol,0,0)==1){
		    for(int i=0;i<4;i++){
		        for(int j=0;j<4;j++){
		            System.out.print(sol[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else{
		    System.out.println("no solution");
		}
}
}
