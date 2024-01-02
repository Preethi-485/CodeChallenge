import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> l=new ArrayList<List<String>>();
        HashMap<String,List<String>> h=new HashMap<>();
        for(int i=0;i<str.length;i++){
            char ch[]=str[i].toCharArray();
            Arrays.sort(ch);
            String res="";
            for(char val:ch)
            res+=val;
            if(!h.containsKey(res)){
                List<String> n=new ArrayList<>();
                n.add(str[i]);
                h.put(res,n);
            }
            else{
                List<String> n=h.get(res);
                n.add(str[i]);
                h.put(res,n);


            }
           // h.put(res)

          //  System.out.printf("%s",res);
           // System.out.printf("\n");
        }
        //System.out.println(h);
        for(Map.Entry<String,List<String>> i:h.entrySet()){
            List<String> x=i.getValue();
            l.add(x);
         //   System.out.println(x);
        }
        return l;
        
        
    }
}