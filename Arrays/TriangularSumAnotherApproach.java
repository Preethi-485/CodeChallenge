import java.util.*;
public class TriangularSumAnotherApproach{
    public static void main(String[] args){
        int nums[]={1,2,3,4,5};
        System.out.println(triangle(nums));
    }
    public static int triangle(int nums[]){
       
        int n=nums.length;
        List<Integer> l=pascal(n);
        int val=0;
        for(int i=0;i<l.size();i++){
            val+=nums[i]*l.get(i);

        }
       // System.out.println(val%10);
        return val%10;
    }
    public static List<Integer> pascal(int n){
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            l.add(generate(i+1));
        }
        return l.get(n-1);

    }
    public static List<Integer> generate(int n){
        long val=1;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=n-1;i++){
            val=val*(n-i);
            val=val/i;
            row.add((int)val);
        }
        return row;
    }
}