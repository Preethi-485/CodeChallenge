import java.util.*;
class SmallestWindowContaining012{
    /*class Solution {
    public int checkString(String str){
       // char ch[]=str.toCharArray();
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!h.contains(str.charAt(i)))
            h.add(str.charAt(i));
        }
    // Set<String> h = new HashSet<>(Arrays.stream(ch).collect(Collectors.toSet()));
        if(h.size()==3)
        return str.length();
        else return -1;
    }
    public int smallestSubstring(String s) {
        
        int min=s.length()+1;
        
        for(int i=0;i<=s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                String res=s.substring(i,j);
                //System.out.println(res);
                int n=checkString(res);
                if(n!=-1){
                    if(n<=min)
                    min=n;
                }
            }
        }
        if(min==s.length()+1)
        return -1;
        else
        return min;
        // Code here
    }
};*/
/*class Solution{
    public int checkString(String str){
       // char ch[]=str.toCharArray();
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!h.contains(str.charAt(i)))
            h.add(str.charAt(i));
        }
    // Set<String> h = new HashSet<>(Arrays.stream(ch).collect(Collectors.toSet()));
        if(h.size()==3)
        return str.length();
        else return -1;
    }
    public String sub(String s,int start,int end){
        String res="";
        for(int i=start;i<=end;i++)
        res+=s.charAt(i);
        return res;
    }
        public int smallestSubstring(String s) {
            if(s.length()==3){
                char ch[]=s.toCharArray();
                Arrays.sort(ch);
                String r=new String(ch);
                String end="012";
                if(r.equals(end))
                return 3;
            }
            int left=0;
            int right=left+2;
            int min=s.length();
            while(right<s.length()){
                if(right==s.length())
                {
                    left++;
                   // if(left+2==s.length())
                    //right=left+1;
                    //else
                    right=left+2;
                }
                if(left==s.length()-2)
                break;
                String res=sub(s,left,right);
               int n= checkString(res);
               if(n!=-1){
                   if(n<=min)
                   min=n;
               }
               right++;
                
                
            }
        if(min==s.length())
      return -1;
      else
        return min;
        }

    
};*/
class Solution{
    public int smallestSubstring(String S) {
         int zero=-1,one=-1,two=-1,res=100001;
for(int i=0;i<S.length();i++)
{
  if(S.charAt(i)=='0')
  zero=i;
  if(S.charAt(i)=='1')
  one=i;
  if(S.charAt(i)=='2')
  two=i;
  if(zero==-1 || one ==-1 || two==-1)
  continue;
  int max=Math.max(Math.max(one,two),zero);
  int min=Math.min(Math.min(one,two),zero);
  res=Math.min(res,(max-min+1));
}
return res==100001?-1:res;


}

};

}
    