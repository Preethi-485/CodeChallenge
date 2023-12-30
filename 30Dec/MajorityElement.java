import java.util.*;

class MajorityElement {
    
    public static int majorityElement(int[] nums) {
        int n=(int)Math.floor(nums.length/2);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                if(val==nums[j])
                c++;
            }
            if(c>n)
            return val;

        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int nums[]={};
        System.out.println(majorityElement(nums));
    }
}