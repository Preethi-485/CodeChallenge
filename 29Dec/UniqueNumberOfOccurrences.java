import java.util.*;
class UniqueNumberOfOccurrences{
    public static boolean unique(int[] arr){
 /*  HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> m=new HashSet<>();
        
       // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int c=0;
            if(!m.contains(arr[i])){
            m.add(arr[i]);
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                c++;
            }
           // i=j;
        
            if(!h.contains(c))
            h.add(c);
            else
            return false;
            }
            else
            continue;
        }
        return true;*/
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
    HashSet<Integer> m=new HashSet<>(h.values());
    if(m.size()==h.size())
    return true;
    else
    return false;
    
    }
    public static void main(String[] args){
        int arr[]={1,2,2,1,1,3};
        System.out.println(unique(arr));

    }
    
}