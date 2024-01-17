import java.util.*;
public class ThreeSum{
    public static void main(String[] args){
        int arr[]={0,0,0};
        List<List<Integer>> l=threeSum(arr);
        System.out.println(l);
    }
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        HashSet<List<Integer>> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int target=0-nums[i];
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                if(nums[start]+nums[end]==target){
                    List<Integer> l=new ArrayList<>(Arrays.asList(nums[i],nums[start],nums[end]));
                    h.add(l);

                }
                else if(nums[start]+nums[end]>target){
                    end--;
                    continue;
                }
                else if(nums[start]+nums[end]<target)
                {
                    start++;
                    continue;
                }
                start++;
                end--;
            }
        }
        List<List<Integer>> result=new ArrayList<List<Integer>>(h);
        return result;


    }
}














