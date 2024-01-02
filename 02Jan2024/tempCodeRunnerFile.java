import java.util.*;
class TwoSum{
    public static void main(String[] args){
        int nums[]={2,7,4,5};
        int target=9;
        int arr[]=sum(nums,target);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static int[] sum(int nums[],int target){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],i);

        }
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i+