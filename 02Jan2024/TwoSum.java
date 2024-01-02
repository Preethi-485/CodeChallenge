import java.util.*;
class TwoSum{
    public static void main(String[] args){
        int nums[]={3,2,4};
        int target=6;
        int arr[]=sum(nums,target);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static int[] sum(int nums[],int target){
        HashMap<Integer,Integer> h=new HashMap<>();
                int arr[]=new int[2];

        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])){
                arr[1]=i;
                arr[0]=h.get(target-nums[i]);
                      //  System.out.println(arr[0]+" "+arr[1]);

                break;
            }
                        h.put(nums[i],i);

        }
        return arr;
    }
}