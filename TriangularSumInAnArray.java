import java.util.*;
public class TriangularSumInAnArray{
    public static int triangle(int nums[]){
        while(nums.length>1){
            int arr[]=new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++)
            arr[i]=(nums[i]+nums[i+1])%10;
            nums=arr;
        }
        int val=nums[nums.length-1];
        return val;
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5};
        System.out.println(triangle(nums));
    }
}