/*import java.util.*;
class TrappingRainWater{
    public static void main(String[] args){
        int height[]={};
        System.out.println(trap(height));
    }
    public static int trap(int arr[]){
        int n=arr.length;
        int sum=0;
        int max=-1;
        int prev=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>prev){
                if(arr[i]>max){
                    max=arr[i];
                }
                else
                sum+=(max-arr[i]);
            }
            prev=arr[i];


           /* compare arr[i] with prev{
                if greater than prev{
                    compare arr[i] with max{
                        if greater update max
                        else update sum+=max-arr[i]
                    }
                }
                prev=arr[i]
            }






            compare i with max{
                i>max
                update max
            }
            compare(i,i+1){
                update max;
                if(i!=0||i+1!=n-1)
                update sum
            }
        }
    }
}*/