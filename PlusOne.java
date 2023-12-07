import java.util.*;
public class PlusOne{
    public static void main(String[] args){
        int digits[]={9};
        System.out.println(plus(digits));
    }
    public static int[] plus(int digits[]){
        int n=digits.length;
        String str="";
        for(int i=0;i<n;i++)
        str+=Integer.toString(digits[i]);
        int val=Integer.valueOf(str)+1;
        //System.out.println(val);
      String res=Integer.toString(val);
        System.out.println(res);
        int arr[]=new int[res.length()];
        for(int i=0;i<res.length();i++){
        arr[i]=Integer.valueOf(res.charAt(i))-48;
        System.out.println(arr[i]);
        }
        


        return arr;

    }
    
}