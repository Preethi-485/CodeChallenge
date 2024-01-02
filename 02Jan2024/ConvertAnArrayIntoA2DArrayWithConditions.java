import java.util.*;
class ConvertAnArrayIntoA2DArrayWithConditions{
    public static void main(String[] args){
        int nums[]={1,3,4,1,2,3,1};
        List<List<Integer>> l=convert(nums);
        System.out.println(l);
    }
    public static List<List<Integer>> convert(int nums[]){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int val:nums)
        h.put(val,h.getOrDefault(val,0)+1);
        int row=-1;
       for(int val:nums){
        if(h.get(val)>row)
        row=h.get(val);
       }
       int col=h.size();
       System.out.println(row+" "+col);
       List<List<Integer>> l=new ArrayList<List<Integer>>();
       for(int k=0;k<row;k++)
       {
        List<Integer> x=new ArrayList<>();
       for(Map.Entry<Integer,Integer> i:h.entrySet()){
       if(h.get(i.getKey())>0){
        x.add(i.getKey());
        h.put(i.getKey(),h.get(i.getKey())-1);
       }

       }
       l.add(x);
    }
    System.out.println(h);

       return l;

    }
}