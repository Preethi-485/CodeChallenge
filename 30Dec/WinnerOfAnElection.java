import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WinnerOfAnElection {
    public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> h=new HashMap<>();
        for(String val:arr)
        {
            h.put(val,h.getOrDefault(val,0)+1);
        }
        int max=-1;
        for(Map.Entry<String,Integer> entry:h.entrySet()){
            if(entry.getValue()>max){
            max=entry.getValue();
            }
        }
        List<String> l=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:h.entrySet()){
            if(entry.getValue()==max){
                l.add(entry.getKey());
                
            }
        }
        Collections.sort(l);
        
        String r[]=new String[2];
        r[0]=l.get(0);
        r[1]=Integer.toString(max);
        //System.out.println(max);
        
        
        return r;
    }
    
}
