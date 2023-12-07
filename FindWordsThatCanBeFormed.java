import java.util.*;
public class FindWordsThatCanBeFormed{
    public static int leng(String words[], String chars){
        int arr[]=new int[26];
        for(int i=0;i<chars.length();i++){
            arr[chars.charAt(i)-'a']++;
        }
        int res=0;
        for(String val:words){
            int r=0;
            int c[]=new int[26];
            for(int i=0;i<val.length();i++)
            c[val.charAt(i)-'a']++;
            /*for(int i=0;i<26;i++)
        System.out.printf("%d ",c[i]);
        System.out.printf("\n\n");*/
        for(int i=0;i<26;i++){
            if(c[i]<=arr[i])
            r++;
            
            
        }
        if(r==26)
        res+=val.length();
        }
        for(int i=0;i<26;i++)
        System.out.printf("%d ",arr[i]);
        System.out.printf("\n\n");
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String words[]={"hello","world","leetcode"}; String chars = "welldonehoneyr";
        //String chars="atach";
        System.out.println(leng(words,chars));
    }
    
}
