import java.util.*;
class TwoSum{
    public static void main(String[] args){
        int arr[]={2,7,11,15};
        int target=9;
        int res[]=two(arr,target);
        for(int val:res)
    System.out.println(val);
        
    }
    public static int[] two(int[] arr,int t){
        HashSet<Integer> h=new HashSet<>();
        int res[]=new int[2];
        for(int val:arr){
            h.add(t-val);
        }
       // System.out.println(h);
        for(int val:arr){
        if(h.contains(t-val))
            res[0]=val;
            res[1]=t-val;
            break;
        }
        return res;

    }
}