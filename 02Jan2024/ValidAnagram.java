import java.util.*;
class ValidAnagram{
    public static void main(String[] args){
        String s="anagrm";
        String t="nagaam";
        System.out.println(valid(s,t));
    }
    public static boolean valid(String s,String t){
        if(s.length()!=t.length())
        return false;
        int c[]=new int[27];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;

        }
        for(int val:c)
        {
            if(val!=0)
            return false;
        }
      //  System.out.println((int)t.charAt(0));
        //return false;
        return true;
    }
}