
import java.util.*;
public class LargestSubstringBetweenTwoEqualCharacters {
   
   
        public int maxLengthBetweenEqualCharacters(String s) {
                    int max=-1;
    
    
            for(int k=0;k<s.length();k++){
            HashMap<Character,Integer>h=new HashMap<>();
            List<Integer> l=new ArrayList<>();
            h.put(s.charAt(k),k);
            //h.put(s.charAt(j),j);
            l.add(k);
            for(int i=k+1;i<s.length();i++){
                if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),i);
                l.add(i);
                }
                /*else if(h.containsKey(s.charAt(i))){
                    if(!l.contains(h.get(s.charAt(i))))
                    l.add(h.get(s.charAt(i)));
                    l.add(i);
                }*/
            }
            for(int i=0;i<l.size();i++){
                for(int j=i+1;j<l.size();j++){
                    if(((l.get(j)-l.get(i))-1)>max)
                    max=(l.get(j)-l.get(i))-1;
                }
            }
           /* System.out.println(h);
            System.out.println(l);
            System.out.println(max);*/
            
            
        }
        return max;
        
    }
    
    
}
