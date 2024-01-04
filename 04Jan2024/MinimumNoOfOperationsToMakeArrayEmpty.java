import java.util.*;
class MinimumNoOfOperationsToMakeArrayEmpty{
   // class Solution {
        public int check(int num){
            int sum=0;
            int temp=num;
            
            while(temp%3!=0){
                temp=temp-2;
    
    
            }
           // System.out.println(temp);
            sum=sum+(temp/3)+((num-temp)/2);
            return sum;
                }
        public int minOperations(int[] nums) {
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int val:nums){
                hm.put(val,hm.getOrDefault(val,0)+1);
            }
            System.out.println(hm);
            int c=0;
            for(Map.Entry<Integer,Integer> h:hm.entrySet()){
                if(h.getValue()==1)
                return -1;
                if(h.getValue()==2){
                                c++;
                    System.out.println("2val c "+c);
                }
                if(h.getValue()==3){
                c++;
                                System.out.println("3val c "+c);
                }
                if(h.getValue()==4){
                c+=2;
                 System.out.println("4val c "+c);
                }
                if(h.getValue()%3==0 && h.getValue()>4){
                    c=c+(h.getValue()/3);
                                 System.out.println("3divisibleval c "+c);
    
                }
                if(h.getValue()%3!=0 && h.getValue()>4){
                                 System.out.println("greater c "+c);
    
                    c+=check(h.getValue());
                }
    
    
            }
            return c;
            
        }
    }