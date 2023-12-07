import java.util.*;
public class LargestOddNumberInString{
    public static String largest(String str){
        String s="";
       for(int i=str.length()-1;i>=0;i--){
           if(Integer.valueOf(str.charAt(i))%2!=0){
           s=str.substring(0,i+1);
           break;
           

       }
    }
       return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
   // System.out.println(str);
   System.out.println(largest(str));

}
}