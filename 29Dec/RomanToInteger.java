import java.util.*;
class RomanToInteger{
    public static void main(String[] args) {
        String s="IV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s){
      //  public int romanToInt(String s) {
            HashMap<Character,Integer> h=new HashMap<>();
          h.put('I',1);
          h.put('V',5);
          h.put('X',10);
          h.put('L',50);
          h.put('C',100);
          h.put('D',500);
          h.put('M',1000);
         
        /*  int val=s.length()-1;
          while(val>0){
              if(h.get(s.charAt(val))>h.get(s.charAt(val-1))){
                  fs+=(h.get(s.charAt(val))-h.get(s.charAt(val-1)));
                  val=val-2;
              }
              else{
                  fs+=(h.get(s.charAt(val)));
                  System.out.println("fs: "+fs+" "+"val : "+val);
                  val=val-1;
  
              }
  
          }
          if(val>=0)
          fs+=h.get(s.charAt(0));*/
          int next=h.get(s.charAt(s.length()-1));
         int fs=next;
          for(int i=s.length()-2;i>=0;i--){
              int val=h.get(s.charAt(i));
              if(val<next){
                  fs-=val;
              }
              else
              fs+=val;
              next=val;
  
          }
          
          return fs;
  
          
      }
    }