import java.util.*;
class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int val:nums){
            h.put(val,h.getOrDefault(val,0)+1);
        }
        List<Integer> arr[]=new ArrayList[nums.length+1];
       for(int val:h.keySet()){
           int f=h.get(val);
           if(arr[f]==null){
               arr[f]=new ArrayList<>();
           }
           arr[h.get(val)].add(val);
       }
       int val=0;
       int res[]=new int[k];
       for(int i=nums.length;i>=0;i--){
           if(arr[i]!=null){
           //continue;
           for(int x:arr[i]){
           res[val++]=x;
           if(val==k)
           return res;
           }
           }

       }
       return res;
        
    }
}