public class HistArea
{
   public static void main(String[]a){
        Main ob=new Main();
        int arr[]={2,1,2};
        int la[]=new int[6];
        int ra[]=new int[6];
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]>arr[i])
                    c++;
                if(arr[j]<arr[i])
                    break;
            }
            ra[i]=c;
            c=0;
            for(int j=i;j>=0;j--){
                if(arr[j]>arr[i])
                    c++;
                if(arr[j]<arr[i])
                    break;
            }
            la[i]=c;
            c=0;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if((la[i]+ra[i]+1)*arr[i]>max)
                max=(la[i]+ra[i]+1)*arr[i];
        }
        System.out.print(max);
}
}











