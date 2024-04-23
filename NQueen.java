public class NQueen
{
    public int safe(int arr[][],int row,int column){
        int i,j;
        for(i=column;i>=0;i--){
            if(arr[row][i]==1){
                return 0;
            }
        }
        for(i=row,j=column;i>=0 && j>=0;i--,j--){
            if(arr[i][j]==1){
                return 0;
            }
        }
        for(i=row,j=column;i<4 && j>=0;i++,j--){
            if(arr[i][j]==1){
                return 0;
            }
        }
        return 1;
    }
    public int solution(int arr[][],int column){
        if(column>3){
            return 1;
        }
        for(int row=0;row<4;row++){
            if(safe(arr,row,column)==1){
                arr[row][column]=1;
                if(solution(arr,column+1)==1){
                    return 1;
                }
            }
            arr[row][column]=0;
        }
        return 0;
    }
	public static void main(String[] args) {
		int arr[][]={{0,0,0,0},
		             {0,0,0,0},
		             {0,0,0,0},
		             {0,0,0,0}};
		Main ob=new Main();
		if(ob.solution(arr,0)==1){
		    for(int i=0;i<4;i++){
		        for(int j=0;j<4;j++){
		            System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else{
		    System.out.println("no solution");
		}
	}
}
