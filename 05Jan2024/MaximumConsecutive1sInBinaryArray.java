import java.util.*;
class MaximumConsecutive1sInBinaryArray{
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
        
    }
        public static int findMaxConsecutiveOnes(int[] arr) {
            int c=0;
            int max=0;
            for(int i=0;i<arr.length;i++){
                
                if(arr[i]==1){
                c++;
                if(c>max)
                max=c;
                
                
                }
                else
                c=0;
            }
            return max;
        }
    }
