public class PrintHisto{
    public static void main(String[]a){
        int arr[]={2,3,4,5,1,6,2};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i]>max)
                max=arr[i];
        for(int i=0;i<arr.length;i++)
            arr[i]=max-arr[i];
        for(int i=0;i<max;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>0){
                    System.out.print("  ");
                    arr[j]--;
                }
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
            
    }
}
