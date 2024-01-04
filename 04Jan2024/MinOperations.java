import java.util.*;
class MinOperations {
    public int check(int num){
        int sum=0;
        int temp=num;
        while(temp%3!=0){
            temp=temp-2;
  }
        sum=sum+(temp/3)+((num-temp)/2);
        return sum;
            }
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int val:nums){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        int c=0;
        for(Map.Entry<Integer,Integer> h:hm.entrySet()){
        /*    if(h.getValue()==1)
            return -1;
           else if(h.getValue()==2){
                            c++;}
            else if(h.getValue()==3){
            c++; }
            else if(h.getValue()==4){
            c+=2;
            }
            else if(h.getValue()%3==0 && h.getValue()>4){
                c=c+(h.getValue()/3);
                            }
           else if(h.getValue()%3!=0 && h.getValue()>4){
                          c+=check(h.getValue());
            }*/
            if(h.getValue()==1)
            return -1;
            else if(h.getValue()==3)
            c+=1;
            else if(h.getValue()%3==0)
            c+=(h.getValue()/3);
            else if((h.getValue()-2)%3==0)
            c+=(h.getValue()/3)+1;
            else if((h.getValue()-4)%3==0)
            c+=(h.getValue()/3)+2;
        }
        return c;
        
    }
}