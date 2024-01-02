import java.util.*;



class GeekAndBuilding {
    public static long maximum_energy(int n, int[] arr) {
        // code here
        long max=-1;
        int tall=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>tall)
            tall=arr[i];
        }
        for(int i=0;i<n;i++){
            long sum=arr[i];
            int prev=arr[i];
            for(int j=i+1;j<n;j++){
               // prev=arr[i]
                if(arr[j]>=prev/*&&arr[j]!=tall*/){
                    sum=sum^arr[j];
                    prev=arr[j];
                    
                }
                else if(arr[j]==tall)
                break;
            }
           // System.out.println(sum);
            if(sum>max)
            max=sum;
        }
        return max;
    }
}
        
