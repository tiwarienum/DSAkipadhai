public class PrimsAlg
{
    public void solution(int arr[][],int v,int start){
        boolean visited[]=new boolean[v];
        visited[start]=true;
        int edge=0;
        while(edge<v-1){
            int min=10000;
            int x=0,y=0;
            for(int i=0;i<v;i++){
                if(visited[i]==true){
                    for(int j=0;j<v;j++){
                        if(arr[i][j]!=0 && visited[j]!=true){
                            if(arr[i][j]<min){
                                min=arr[i][j];
                                x=i;
                                y=j;
                            }
                        }
                    }
                }
            }
            visited[y]=true;
            System.out.println(x+"->"+y+" : "+arr[x][y]);
            edge++;
        }
    }
    public static void main(String[] args) {
		Main ob=new Main();
		int arr[][]={{0,2,0,6,7},
		             {2,0,3,1,5},
		             {0,3,0,9,4},
		             {6,1,9,0,0},
		             {7,5,4,0,0}};
		ob.solution(arr,5,0);
		
		
	}
}













