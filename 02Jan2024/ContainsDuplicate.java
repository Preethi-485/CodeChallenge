import java.util.*;
class ContainsDuplicate{
    public static void main(String[] args){
        int nums[]={1,2,3,5};
        System.out.println(dup(nums));
    }
    public static boolean dup(int nums[]){
        HashSet<Integer> h=new HashSet<>();
        for(int val:nums){
            if(h.contains(val))
            return true;
            h.add(val);
        }
        return false;
    }
}