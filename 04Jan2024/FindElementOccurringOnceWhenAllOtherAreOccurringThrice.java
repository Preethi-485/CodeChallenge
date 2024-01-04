import java.util.*;




//User function Template for Java

class FindElementOccurringOnceWhenAllOtherAreOccurringThrice
 {
    static int singleElement(int[] arr , int N) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int val:arr){
            h.put(val,h.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer,Integer>i:h.entrySet()){
            if(i.getValue()==1)
            return i.getKey();
        }
        return -1;
        // code here
    }
}