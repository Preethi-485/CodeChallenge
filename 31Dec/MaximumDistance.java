
import java.util.*;
class MaximumDistance {
    public static int solve(int N, int a, int[] x) {
        // code here
     //   Arrays.sort(x);
       // return (x[N-1]-a)+(x[N-2]-a);
       // int c=0;
        //int sum=0;
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=x[i]-a;
            if(arr[i]<0)
            arr[i]=arr[i]*-1;
        }
        Arrays.sort(arr);
   /*       for(int i=0;i<N;i++){
System.out.printf("%d ",arr[i]);
}
System.out.printf("\n");*/
      
        /*for(int i=N-1;i>=0;i--){
            if(c<=a){
                sum+=(x[i]-a);
                c++;
            }
            
        }
        return sum;*/
        return (arr[N-1]+arr[N-2]);
    }
}
        
