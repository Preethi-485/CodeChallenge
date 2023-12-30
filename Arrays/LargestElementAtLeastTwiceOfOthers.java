import java.util.*;
class LargestElementAtLeastTwiceOfOthers {
    public static void main(String[] args){
        int nums[]={3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
    public static int max(int nums[]){
        int val=-1;
        for(int i=0;i<nums.length;i++){
if(val<nums[i])
        val=nums[i];
}
        return val;
    }
    public static int dominantIndex(int[] nums) {
        int val=max(nums);
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
        System.out.println(val);
        int arr[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            arr[i]=nums[i]*2;
            if(val<arr[i])
                return -1;
        }
        return 0;
    }
}