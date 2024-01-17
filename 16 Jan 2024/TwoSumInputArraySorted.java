import java.util.*;
public class TwoSumInputArraySorted {
    public static void main(String[] args){
        int arr[]={2,7,10,11};
        int target=9;
        int res[]=twoSum(arr,target);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
    public static int[] twoSum(int[] nums,int target){

        int start=0;
        int end=nums.length-1;
        int res[]=new int[2];
        while(start<end){
            if(nums[start]+nums[end]>target){
                end--;
                continue;
            }
            if(nums[start]+nums[end]<target){
                start++;
                continue;
            }
            if(nums[start]+nums[end]==target)
            {
                res[0]=start+1;
                res[1]=end+1;
                break;

            }
        }
        return res;

    }
    
}
