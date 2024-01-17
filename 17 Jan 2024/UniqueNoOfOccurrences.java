import java.util.*;
public class UniqueNoOfOccurrences{
    public static void main(String[] args){
        int arr[]={1,2,2,1,1,3};
        System.out.println(unique(arr));
    }
    public static boolean unique(int[] arr){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int val:arr){
            h.put(val,h.getOrDefault(val,0)+1);

        }
        HashSet<Integer> m=new HashSet<>(h.values());
        if(h.size()==m.size())
        return true;
        else
        return false;
       
    }
}