import java.util.*;
class IntersectionOfArrays{
    public static void main(String[] args){
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int res[]=inter(nums1,nums2);
        for(int i=0;i<res.length;i++)
        System.out.println(res[i]);
    }
    public static int[] inter(int[] nums1, int[] nums2) {
        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();

        for(var n : nums1){
            set1.add(n);
        }
        for(var n : nums2){
            if(set1.contains(n)){
                set2.add(n);
            }
        }
        var arr = new int[set2.size()];
        var i = 0;
        for(var n : set2){
            arr[i++]=n;
        }
        return arr;
    }

}